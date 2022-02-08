package assignments.complex.parkinglot.src.main.parkingSkeleton.Modal;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;
import assignments.complex.parkinglot.src.main.customer.PLSubscribedCustomer;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeUnit;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeStamp;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.ParkingHistory;
import assignments.complex.parkinglot.src.main.utils.PLReadWriteUtils;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import utils.deserializer.Deserializer;
import utils.serializer.Serializer;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public class ParkingLot implements ParkingLotI{
    ParkingLotAnalytics parkingLotAnalytics = new ParkingLotAnalytics();
    PLReadWriteUtils readWriteUtils = new PLReadWriteUtils();
    Deserializer deserializer = new Deserializer();
    Serializer serializer = new Serializer();

    public PLCustomer initCustomer(String vehicleNumber, boolean subscribed) {
        boolean newCustomer = false;
        newCustomer = readWriteUtils.checkCustomerID(vehicleNumber);
        PLCustomer customer = null;

        /* not existing customer */
        if (!newCustomer){
            customer = getRequiredCustomer(vehicleNumber, subscribed);
            ParkingHistory parkingHistory = new ParkingHistory();
            customer.setParkingHistory(parkingHistory);
            PLTimeStamp timeStamp = new PLTimeStamp();
            customer.setLastParking(timeStamp);
        } else/*existing customer*/{
            /**
             * find customer, deserialise the customer details into PLCustomer object
             * set PLTimeStamp into PLCustomer
             */
            try{
                String customerDetails = findCustomerToGetDetails(vehicleNumber);
                /**
                 * This is backup code in deserializer fails
                ObjectMapper objectMapper = new ObjectMapper();
                customer = objectMapper.readValue(new File(dirPath), PLCustomer.class);
                */

                customer = getRequiredDeserialisedCustomer(customerDetails, subscribed);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return customer;
    }

    /**
     * to be used by public methods
     * @return
     */
    private PLTimeStamp initTime() {
        return null;
    }

    /**
     *
     * @param vehicleNumber
     * @return
     */
    private String findCustomerToGetDetails(String vehicleNumber){
        String dirPath = "src/test/java/assignments/complex/parkinglot/src/" +
                "resources/CustomersJson";
        String requiredData = "";
        File directory = new File(dirPath);
        File[] files = directory.listFiles();
        for(File fileName : files){
            String[] path = fileName.toString().toString().split("/");
            if (path[path.length-1].startsWith(vehicleNumber)){
                requiredData = readWriteUtils.readFile(dirPath + "/" + vehicleNumber + ".json");
                break;
            }
        }

        return requiredData;
    }

    /**
     * write customer's details into json file by passing vehicle number
     * @param vehicleId
     */
    private void writeJsonDetails(String vehicleId, PLCustomer customer){

        try {
            String filePath = "src/test/java/assignments/complex/parkinglot/src/" +
                    "resources/CustomersJson/" + vehicleId + ".json";
            String jsonString = serializer.getJsonString(customer);
            jsonString = jsonString.replace("\n", "").replace("\t", "");
            String jsonString2 = "";
            readWriteUtils.writeJsonToAFile(filePath, jsonString);

        } catch (SerializeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * to be used by private method.
     * This method should be implemented to keep rates sync
     * for different dates
     * @return
     */
    private int initCurrentDateCharge() {
        return 0;
    }

    /**
     * This method is ensure total parked customers at the moment
     * @return
     */
    public List<PLCustomer> getParkedCustomers(){
        return null;
    }

    /**
     * Set Customers checkout time from parking
     */
    // change it back to private method
    private PLCustomer setCustomerCheckout(PLCustomer customer){
        customer.getLastParking().setOutTime(new Timestamp(System.currentTimeMillis()).toString());
        return customer;
    }

    public PLCustomer releaseCustomerFromParking(PLCustomer customer) {
        /**
         * calculate the time stayed in the parking (DONE)
         * calculate the bill (DONE)
         * push customer's visit in the customer's history (DONE)
         * write the customer's data into database (DONE)
         * update the totalsales (partially DONE)
         * update the today's sale (partially DONE)
         * update active parking customers (partially DONE)
         */
        customer.getLastParking().setOutTime(new Timestamp(System.currentTimeMillis()).toString());

        PLTimeUnit timeStayed;
        timeStayed = calculateTimeCustomerOccupiedParking(customer);
        int billingHours = calculateRoundedFigureHours(timeStayed);
        customer.getLastParking().setHoursParkingIsOccupied(billingHours);
        customer.getLastParking().setParkingChargeThatDay(10);
        customer.getLastParking().setAmountPaid(billingHours * 10);

        customer.getParkingHistory().getCustomerParkingHistory().add(customer.getLastParking());

        writeJsonDetails(customer.getVehicleNumber(),customer);

        parkingLotAnalytics.updateTotalSalesSoFar();;
        parkingLotAnalytics.updateTodaySale();
        parkingLotAnalytics.removeCustomerFromParking(customer);

        return customer;
    }

    private int calculateRoundedFigureHours(PLTimeUnit timeStayed) {
        if (timeStayed.getMinutes()>=30){
            timeStayed.setHours(timeStayed.getHours()+1);
        } else if (timeStayed.getHours()==0){
            timeStayed.setHours(1);
        }
        return timeStayed.getHours();
    }


    private PLTimeUnit calculateTimeCustomerOccupiedParking(PLCustomer customer){
        Timestamp timestampIn = Timestamp.valueOf(customer.getLastParking().getInTime());
        Timestamp timestampOut = Timestamp.valueOf(customer.getLastParking().getOutTime());
        long milliSeconds = timestampOut.getTime() - timestampIn.getTime();
        PLTimeUnit time = new PLTimeUnit();
        int seconds = (int)milliSeconds/1000;
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        seconds = (seconds%3600)%60;
        time.setHours(hours);
        time.setMinutes(minutes);
        time.setSeconds(seconds);
        return time;
    }


    private PLCustomer getRequiredCustomer(String vehicleNumber, boolean subscribed){
        if (!subscribed){
            return new PLCustomer(vehicleNumber);
        } else
            return new PLSubscribedCustomer(vehicleNumber);
    }

    private PLCustomer getRequiredDeserialisedCustomer(String customerDetails, boolean subscribed){
        PLCustomer customer = null;
        if (!subscribed){
            try {
                customer =  deserializer.getDeserializedObj(customerDetails, PLCustomer.class);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //return new PLCustomer(vehicleNumber);
        } else {
                try {
                    customer = deserializer.getDeserializedObj(customerDetails, PLSubscribedCustomer.class);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        return customer;

    }


}

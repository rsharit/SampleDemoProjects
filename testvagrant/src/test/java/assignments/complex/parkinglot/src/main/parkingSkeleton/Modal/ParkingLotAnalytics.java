package assignments.complex.parkinglot.src.main.parkingSkeleton.Modal;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class contains attributes for analytics of parking lot
 */
public class ParkingLotAnalytics {
    private int totalSalesSoFar;
    private int todaySale;
    private HashMap<String, PLCustomer> currentParkedCustomer = new HashMap<>();
    private List<PLCustomer> totalCustomers = new ArrayList<>();
    private List<Integer> customersUniqueID = new ArrayList<>();

    public void updateTotalSalesSoFar(){
        /**
         * write total sales to file to make it persistant
         *
         * read file if total sale is available
         * if available update it, total sales = total sales + new sale
         * else simply write the value to the file
         */


    }

    public void updateTodaySale(){
        /**
         * write today's sales to file to make it persistant
         *
         * read file if today's sale is available
         * if available update it, today sales = today sales + new sale
         * else simply write the value to the file
         */
    }

    public void removeCustomerFromParking(PLCustomer customer){
        if (currentParkedCustomer.keySet().contains(customer.getVehicleNumber()))
            currentParkedCustomer.remove(customer.getVehicleNumber());
        else {
            /**
             * raise custom exception, customer's vehicle not found
             */
            System.out.println("Partially implemented - public void removeCustomerFromParking(PLCustomer customer)");
        }
    }
}

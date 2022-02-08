package assignments.complex.parkinglot.src.main.parkingSkeleton.Modal;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;
import assignments.complex.parkinglot.src.main.customer.PLSubscribedCustomer;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeStamp;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeUnit;
import java.util.List;




public interface ParkingLotI{

    public PLCustomer initCustomer(String vehicleNumber, boolean subscribed);

    /**
     * This method is ensure total parked customers at the moment
     * @return
     */
    public List<PLCustomer> getParkedCustomers();

    public PLCustomer releaseCustomerFromParking(PLCustomer customer) ;

//    /**
//     * to be used by public methods
//     * @return
//     */
//    private PLTimeStamp initTime() {
//        return null;
//    }

//    /**
//     *
//     * @param vehicleNumber
//     * @return
//     */
//    private String findCustomerToGetDetails(String vehicleNumber){
//        return null;
//    }

//    /**
//     * write customer's details into json file by passing vehicle number
//     * @param vehicleId
//     */
//    private void writeJsonDetails(String vehicleId, PLCustomer customer){
//
//
//    }
//
//    /**
//     * to be used by private method.
//     * This method should be implemented to keep rates sync
//     * for different dates
//     * @return
//     */
//    private int initCurrentDateCharge() {
//        return 0;
//    }

//    private PLCustomer setCustomerCheckout(PLCustomer customer){
//        return null;
//    }



//    private int calculateRoundedFigureHours(PLTimeUnit timeStayed) {
//        return 0;
//    }
//
//
//    private PLTimeUnit calculateTimeCustomerOccupiedParking(PLCustomer customer){
//        return null;
//    }
//
//    private PLCustomer getRequiredCustomerObject(boolean subscribed){
//        return null;
//    }

}


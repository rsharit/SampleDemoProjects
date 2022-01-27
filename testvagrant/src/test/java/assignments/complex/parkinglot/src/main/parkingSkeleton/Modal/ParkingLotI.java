package assignments.complex.parkinglot.src.main.parkingSkeleton.Modal;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeStamp;

public interface ParkingLotI {
    /**
     * Init PLTimeStamp
     * set vehicle number
     * set history
     * return PLCustomer
     * @return
     */
    public PLCustomer initCustomer();

    /**
     * to be used by public methods
     * @return
     */
    private PLTimeStamp initTime() {
        return null;
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
     * Calculate total charge
     * This could be list of integers to maintain history
     * of sales
     */
    public void calculateTotalCharge();

    /**
     * This method is to update total sales
     */
    public void updateTotalSale();

    /**
     * This method is to update total sales for the day
     */
    public void updateDaySale();

    /**
     * This method is ensure total parked customers at the moment
     * @return
     */
    public PLCustomer getParkedCustomers();

}

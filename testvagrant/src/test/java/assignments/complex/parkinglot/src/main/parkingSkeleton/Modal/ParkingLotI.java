package assignments.complex.parkinglot.src.main.parkingSkeleton.Modal;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeStamp;

public interface ParkingLotI {
    public PLCustomer initCustomer();
    public PLTimeStamp initTime();
    public int initCurrentDateCharge();
    public void calculateTotalCharge();
    public void updateTotalSale();
    public void updateDaySale();

}

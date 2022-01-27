package assignments.complex.parkinglot.src.test;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;
import assignments.complex.parkinglot.src.main.parkingSkeleton.Modal.ParkingLot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerTests {

    @Test (description = "Checking ParkingLot's initCustomer API")
    public void initCustomerTest(){
        ParkingLot parkingLot = new ParkingLot();
        PLCustomer customer = parkingLot.initCustomer("DL14CA0624");
        Assert.assertNotNull(customer);
    }
}

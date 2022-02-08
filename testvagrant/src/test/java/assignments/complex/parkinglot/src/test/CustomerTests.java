package assignments.complex.parkinglot.src.test;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;
import assignments.complex.parkinglot.src.main.parkingSkeleton.Modal.ParkingLot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerTests {

    @Test (description = "Checking ParkingLot's initCustomer API to get non subscribed customer")
    public void getNonSubscribedCusomer(){
        ParkingLot parkingLot = new ParkingLot();
        PLCustomer customer = parkingLot.initCustomer("DL14CA0624", false);
        Assert.assertNotNull(customer);
    }

    @Test (description = "Checking ParkingLot's initCustomer API to get subscribed customer")
    public void getSubscribedCusomer() {
        ParkingLot parkingLot = new ParkingLot();
        PLCustomer customer = parkingLot.initCustomer("DL14CA0625", true);
        Assert.assertNotNull(customer);
    }


    @Test(description = "Releasing a non subscribed customer from parking ")
    public void testReleasingNonSubscribedCustomer(){
        ParkingLot parkingLot = new ParkingLot();
        PLCustomer customer = parkingLot.initCustomer("DL14CA0624", false);
        parkingLot.releaseCustomerFromParking(customer);
        Assert.assertEquals(true, customer.getParkingHistory().getCustomerParkingHistory().size()>1);
    }

    @Test(description = "Releasing a non subscribed customer from parking ")
    public void testReleasingSubscribedCustomer(){
        ParkingLot parkingLot = new ParkingLot();
        PLCustomer customer = parkingLot.initCustomer("DL14CA0625", true);
        parkingLot.releaseCustomerFromParking(customer);
        Assert.assertEquals(true, customer.getParkingHistory().getCustomerParkingHistory().size()>1);
    }
}

package assignments.complex.parkinglot.src.main.parkingSkeleton.Modal;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains attributes for analytics of parking lot
 */
public class ParkingLotAnalytics {
    private int totalSalesSoFar;
    private int todaySale;
    private List<PLCustomer> currentParkedCustomer = new ArrayList<>();
    private List<PLCustomer> totalCustomers = new ArrayList<>();
    private List<Integer> customersUniqueID = new ArrayList<>();
}

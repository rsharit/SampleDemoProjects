package assignments.complex.parkinglot.src.main.customer;

import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.ParkingHistory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PLCustomer {
    private String name;
    private String vehicleNumber;
    private ParkingHistory parkingHistory;

    PLCustomer(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

}

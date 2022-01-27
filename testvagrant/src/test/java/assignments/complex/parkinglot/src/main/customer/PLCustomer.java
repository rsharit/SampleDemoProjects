package assignments.complex.parkinglot.src.main.customer;

import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeStamp;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.ParkingHistory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PLCustomer {
    private String name;
    /* unique no.*/
    private String vehicleNumber;
    private ParkingHistory parkingHistory;
    private PLTimeStamp lastParking;

    public PLCustomer(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

}

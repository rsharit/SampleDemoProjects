package assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class ParkingHistory {
    List<PLTimeStamp> customerParkingHistory = new ArrayList<>();
}

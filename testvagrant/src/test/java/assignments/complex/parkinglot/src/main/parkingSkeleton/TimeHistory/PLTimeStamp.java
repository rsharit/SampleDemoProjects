package assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PLTimeStamp {
    String inTime;
    String outTime;
    int amountPaid;
    int parkingChargeThatDay;
}

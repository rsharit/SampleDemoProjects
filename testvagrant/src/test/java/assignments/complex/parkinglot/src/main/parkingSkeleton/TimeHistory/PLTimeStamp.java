package assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class PLTimeStamp {
    String inTime;
    String outTime;
    int amountPaid;
    int parkingChargeThatDay;

    public PLTimeStamp(){
        this.inTime = new Timestamp(System.currentTimeMillis()).toString();
    }
}

package assignments.complex.parkinglot.src.main.customer.subscription;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class SubscriptionDetails {
    private LocalDate startDate;
    private int subscriptionCharge;
    private String typeOfSubsciption;
}

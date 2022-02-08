package assignments.complex.parkinglot.src.main.customer;

import assignments.complex.parkinglot.src.main.customer.subscription.SubscriptionDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PLSubscribedCustomer extends PLCustomer{
    SubscriptionDetails subscriptionDetails;

    public PLSubscribedCustomer(String vehicleNumber) {
        super(vehicleNumber);
    }

    /**
     * important for deserialising
     */
    public PLSubscribedCustomer(){

    }
}

package assignments.complex.parkinglot.src.main.customer.types;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;
import assignments.complex.parkinglot.src.main.parkingSkeleton.SubscriptionDetails;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeStamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PLSubscribedCustomer extends PLCustomer {
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

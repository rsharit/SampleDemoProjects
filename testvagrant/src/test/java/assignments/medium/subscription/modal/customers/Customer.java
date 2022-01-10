package assignments.medium.subscription.modal.customers;

import assignments.medium.subscription.modal.commodity.Commodity;

import java.util.HashMap;
import java.util.List;

public class Customer {
    String customerName;
    String customerId;
    HashMap<String/*Name of the commodity*/,
            List<Commodity>> commodities = new HashMap<>();


}

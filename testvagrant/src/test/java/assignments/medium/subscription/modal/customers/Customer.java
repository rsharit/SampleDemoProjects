package assignments.medium.subscription.modal.customers;

import assignments.medium.subscription.modal.commodity.Commodity;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class Customer {
    String customerName;
    int customerId;
    HashMap<String/*Name of the commodity*/,
            List<Commodity>> commodities = new HashMap<>();

//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    public HashMap<String, List<Commodity>> getCommodities() {
//        return commodities;
//    }
//
//    public void setCommodities(HashMap<String, List<Commodity>> commodities) {
//        this.commodities = commodities;
//    }
}

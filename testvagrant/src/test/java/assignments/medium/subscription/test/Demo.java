package assignments.medium.subscription.test;

import assignments.medium.subscription.modal.customers.Customer;
import assignments.medium.subscription.modal.helpers.CustomerHelper.CustomerUtils;

public class Demo {
    public static void main(String[] args){
        CustomerUtils customerUtils = new CustomerUtils();
        Customer customer1 = customerUtils.createCustomer();

        customer1.setCustomerId(customerUtils.generateCustomerId());
        System.out.println();
        ;

    }
}

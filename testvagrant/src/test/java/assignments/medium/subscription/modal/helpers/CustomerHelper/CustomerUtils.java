package assignments.medium.subscription.modal.helpers.CustomerHelper;

import assignments.medium.subscription.modal.commodity.Commodity;
import assignments.medium.subscription.modal.customers.Customer;

public class CustomerUtils implements CustomerUtilsI{

    public Customer createCustomer(){
        return new Customer();
    }


    public void addSubscribedCommodity(Customer customer, Commodity commodity){
        /**
         * update customer subscribed products
         * fetches if a product is existing, if yes update, if not a add a new key and update its value
         */
    }

    public int generateCustomerId(){
        /**
         * use readCustomerIdFromFile to read unique ids
         * generate a random no.
         * write this unique no. to same file using writeCustomerIdToAFile
         * return unique no. generated
         */

        return -1;
    }

    private void readCustomerIdFromFile(){};

    private void writeCustomerIdToAFile(){};
}

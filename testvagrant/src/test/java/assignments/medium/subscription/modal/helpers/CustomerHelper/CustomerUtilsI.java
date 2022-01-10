package assignments.medium.subscription.modal.helpers.CustomerHelper;

import assignments.medium.subscription.modal.commodity.Commodity;
import assignments.medium.subscription.modal.customers.Customer;

public interface CustomerUtilsI {
    /**
     * Method to create and return Customer
     */
    public Customer createCustomer();

    /**
     * Method to update list of commodities for a customer
     * @param customer
     * @param commodity
     */
    public void addSubscribedCommodity(Customer customer, Commodity commodity);

    /**
     * Generate a unique CustomerID
     */
    public int generateCustomerId();

    private void readCustomerIdFromFile(){};

    private void writeCustomerIdToAFile(){};


}

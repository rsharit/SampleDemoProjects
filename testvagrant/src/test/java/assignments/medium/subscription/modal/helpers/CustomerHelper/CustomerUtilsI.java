package assignments.medium.subscription.modal.helpers.CustomerHelper;

import assignments.medium.subscription.modal.commodity.Commodity;
import assignments.medium.subscription.modal.customers.Customer;

import java.io.IOException;

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
    public void addSubscribedCommodityBySubCategory(Customer customer, Commodity commodity);

    /**
     * Generate a unique CustomerID
     */
    private int generateCustomerId(){return 0;};

    private void readCustomerIdFromFile(){};

    private void writeCustomerIdToAFile(){};

    private void writeJsonToAFile(String fileName, String json) throws IOException{};

    //private void readJsonFromAFile(String fileName) throws IOException{};


}

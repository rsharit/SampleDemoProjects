package assignments.medium.subscription.modal.helpers.CustomerHelper;

import assignments.medium.subscription.modal.commodity.Commodity;
import assignments.medium.subscription.modal.customers.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerUtils implements CustomerUtilsI{

    private String uniqueIdFile = "src/test/java/assignments/medium/subscription/resources/uniqueIds.txt";

    public Customer createCustomer(){
        Customer customer = new Customer();
        int uniqueID = generateCustomerId();
        customer.setCustomerId(uniqueID);
        return customer;
    }

    public void addSubscribedCommodityBySubCategory(Customer customer, Commodity commodity){
        /**
         * update customer subscribed products
         * fetches if a product is existing, if yes update, if not a add a new key and update its value
         */

        String subCategory = commodity.getSubCategory();
        if (customer.getCommodities().keySet().contains(subCategory)){
            List<Commodity> commodityList = customer.getCommodities().get(subCategory);
            commodityList.add(commodity);
            customer.getCommodities().put(subCategory, commodityList);
        }
    }

    private int generateCustomerId(){
        /**
         * use readCustomerIdFromFile to read unique ids
         * generate a random no.
         * write this unique no. to same file using writeCustomerIdToAFile
         * return unique no. generated
         */

        // Generating 5 digit unique id
        int uniqueID = (int)(Math.random()*100000);

        try{

            List<Integer> availableIds = readCustomerIdFromFile(uniqueIdFile);
            if (!availableIds.contains(uniqueID))
                availableIds.add(uniqueID);
            else{

                while(availableIds.contains(uniqueID)){
                    uniqueID = (int)(Math.random()*100000);
                    if (!availableIds.contains(uniqueID)){
                        availableIds.add(uniqueID);
                        break;
                    }

                }
            }

            writeCustomerIdToAFile(uniqueIdFile, String.valueOf(uniqueID));

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return uniqueID;
    }

    private List<Integer> readCustomerIdFromFile(String filePath) throws IOException {
        String st;
        File file = new File(filePath);
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        List<Integer> availableIds = new ArrayList<>();


        while ((st = br.readLine()) != null)
            availableIds.add(Integer.valueOf(st));
        return availableIds;
    }

    private void writeCustomerIdToAFile(String fileName, String uniqueId) throws IOException {
        /**
         * note appending text
         */
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(uniqueId + "\n");
        writer.close();
    };

    /**
     *
     * @param fileName
     * @param json
     * @throws IOException
     */
    private void writeJsonToAFile(String fileName, String json) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(json);
        writer.close();
    };
}

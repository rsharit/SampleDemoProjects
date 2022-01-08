package assignments.medium.shoppingcart.src.main.shopUtils;

import assignments.medium.shoppingcart.src.main.Constants.Catalogue;
import assignments.medium.shoppingcart.src.main.Customers.Customer;
import assignments.medium.shoppingcart.src.main.commodities.*;
import assignments.medium.shoppingcart.src.main.shopCustomedException.CommodityNotAvailable;

import java.io.IOException;
import java.util.HashMap;


public class ShoppingUtils {

    Validations validations = new Validations();


    public int calculateBill(Customer customer){
        int billTotal = 0;

        try{
            boolean available = validations.checkIfCommoditiesIsAvailable(customer);
            if (available){
                //Generate bill
                billTotal = validations.generateBill(customer);
            }


        }catch (CommodityNotAvailable e) {
            e.printStackTrace();
        }

        return billTotal;
    }

    public void calculateDiscount(){}

}

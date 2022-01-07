package assignments.medium.shoppingcart.src.main.shopUtils;

import assignments.medium.shoppingcart.src.main.Constants.Catalogue;
import assignments.medium.shoppingcart.src.main.Customers.Customer;
import assignments.medium.shoppingcart.src.main.commodities.Apple;
import assignments.medium.shoppingcart.src.main.commodities.Milk;
import assignments.medium.shoppingcart.src.main.commodities.NewsPaper;

import java.util.HashMap;


public class ShoppingUtils {

    public <T> boolean checkIfAvailable(int buyQuantity, String nameOfCommodity,T commodityObj) {
        switch(nameOfCommodity){
            case Catalogue.apple:
                Apple apple = (Apple) commodityObj;
                if (apple.getQuantity()>=buyQuantity){
                    //apple.setQuantity(apple.getQuantity()-buyQuantity);
                    return true;
                }else
                    return false;
            case Catalogue.milk:
                Milk milk = (Milk) commodityObj;
                if (milk.getQuantity()>=buyQuantity){
                    //milk.setQuantity(milk.getQuantity()-buyQuantity);
                    return true;
                }else
                    return false;
            case Catalogue.newspaper:
                NewsPaper newsPaper = (NewsPaper) commodityObj;
                if (newsPaper.getQuantity()>=buyQuantity){
                    //newsPaper.setQuantity(newsPaper.getQuantity()-buyQuantity);
                    return true;
                }else
                    return false;

            default:
                return false;
        }
    }

    public int calculateBill(Customer customer){
        int billTotal = 0;

        // parse hashmap to get products
        HashMap<String, Integer> purchase = customer.getPurchase();
        for (String commodity : purchase.keySet()){
            if (commodity.equals(Catalogue.apple)){
                //checkIfAvailable(purchase.get("Apple"), "Apple", )

            }
        }

        // parse quantity asked if available
        // if quantity available, check validation rules for discount
        // prepare final bill
        //
        return billTotal;
    }

    public void calculateDiscount(){}

}

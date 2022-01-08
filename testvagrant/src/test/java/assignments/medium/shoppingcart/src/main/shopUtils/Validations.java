package assignments.medium.shoppingcart.src.main.shopUtils;

import assignments.medium.shoppingcart.src.main.Constants.Catalogue;
import assignments.medium.shoppingcart.src.main.Customers.Customer;
import assignments.medium.shoppingcart.src.main.commodities.Apple;
import assignments.medium.shoppingcart.src.main.commodities.Milk;
import assignments.medium.shoppingcart.src.main.commodities.NewsPaper;
import assignments.medium.shoppingcart.src.main.shopCustomedException.CommodityNotAvailable;

import java.util.HashMap;

/**
 * This class is lists validations to be applied before any operation.
 * For example, buying X Litres of milk. Allow purchase if only X is smaller or equal to
 * total quantity of the milk.
 */

public class Validations {

    public boolean ifFree(){
        return false;
    }

    public int Discount(int totalBill){
        int discount = 0;
        // rounding to lower 10th decimal value
        discount = totalBill%10;
//        if (totalBill > 100)
//            discount = totalBill%5;
//        else discount = 0;
        return discount;
    }

    private <T> boolean checkIfCommodityIsAvailable(int buyQuantity, String nameOfCommodity,T commodityObj) {
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


    public boolean checkIfCommoditiesIsAvailable(Customer customer) throws CommodityNotAvailable {
        boolean everyCommodityAvailable = false;


        // parse hashmap to get products and check if purchases are available
        HashMap<String, Integer> purchase = customer.getPurchase();
        for (String commodity : purchase.keySet()){

            // Checking apple availability
            if (commodity.equals(Catalogue.apple)){
                boolean available = checkIfCommodityIsAvailable(purchase.get("Apple"),
                        Catalogue.apple, new Apple().getGlobalApple());


                if (!available){
                    throw new CommodityNotAvailable(purchase.get("Apple") + "are not available."+
                            "Available quantity = " + new Apple().getGlobalApple().getQuantity());
                } else
                    everyCommodityAvailable = true;
            }

            // checking milk availability
            if (commodity.equals(Catalogue.milk)){
                boolean available = checkIfCommodityIsAvailable(purchase.get(Catalogue.milk),
                        Catalogue.milk, new Milk().getGlobalMilk());

                if (!available){
                    everyCommodityAvailable = false;
                    throw new CommodityNotAvailable(purchase.get(Catalogue.milk) + "are not available."+
                            "Available quantity = " + new Milk().getGlobalMilk().getQuantity());
                } else
                    everyCommodityAvailable = true;
            }

            // checking newspaper availability
            if (commodity.equals(Catalogue.newspaper)){
                everyCommodityAvailable = false;
                boolean available = checkIfCommodityIsAvailable(purchase.get(Catalogue.newspaper),
                        Catalogue.newspaper, new NewsPaper().getGlobalNewspaper());

                if (!available){
                    everyCommodityAvailable = false;
                    throw new CommodityNotAvailable(purchase.get(Catalogue.newspaper) + "are not available."+
                            "Available quantity = " + new NewsPaper().getGlobalNewspaper().getQuantity());
                } else
                    everyCommodityAvailable = true;
            }
        }

        return everyCommodityAvailable;
    }

    public int generateBill(Customer customer) {
        int totalBill = 0;
        HashMap<String, Integer> purchase = customer.getPurchase();
        for (String commodity : purchase.keySet()){
            if (commodity.equals(Catalogue.apple))
                totalBill = totalBill + purchase.get(commodity)*new Apple().getGlobalApple().getPrice();
            if (commodity.equals(Catalogue.milk))
                totalBill = totalBill + purchase.get(commodity)*new Milk().getGlobalMilk().getPrice();
            if (commodity.equals(Catalogue.newspaper))
                totalBill = totalBill + purchase.get(commodity)*new NewsPaper().getGlobalNewspaper().getPrice();
        }

        return totalBill;
    }
}

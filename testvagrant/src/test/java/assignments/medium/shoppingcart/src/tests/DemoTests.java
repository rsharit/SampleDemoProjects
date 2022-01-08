package assignments.medium.shoppingcart.src.tests;

import assignments.medium.shoppingcart.src.main.Constants.Catalogue;
import assignments.medium.shoppingcart.src.main.Customers.Customer;
import assignments.medium.shoppingcart.src.main.Customers.EWallet;
import assignments.medium.shoppingcart.src.main.commodities.Apple;
import assignments.medium.shoppingcart.src.main.commodities.Milk;
import assignments.medium.shoppingcart.src.main.shopUtils.ShoppingUtils;
import assignments.medium.shoppingcart.src.main.shopUtils.Validations;

public class DemoTests {

    public static void main(String args[]){

        //instantiate customer
        Customer rsharit = new Customer();
        Validations validations = new Validations();

        // set customer's detail and its wallet
        rsharit.setName("Rajender Singh Harit");
        rsharit.setWallet(new EWallet());
        rsharit.getWallet().setWalletValue(500);

        // initialise purchase
        rsharit.getPurchase().put(Catalogue.apple, 3);
        rsharit.getPurchase().put(Catalogue.milk, 2);
        rsharit.getPurchase().put(Catalogue.newspaper, 2);

        //calculate bill
        ShoppingUtils su = new ShoppingUtils();
        int totalBill = su.calculateBill(rsharit);
        int discount = validations.Discount(totalBill);




        System.out.println("Customer :"+ rsharit.getName());
        System.out.println("Total Bill :"+ totalBill);
        System.out.println("Discount :"+ discount);
        System.out.println("Net bill :" + (totalBill-discount));
        System.out.println("Purchase:/n");
        for(String commodity: rsharit.getPurchase().keySet()){
            System.out.println(commodity + " " + rsharit.getPurchase().get(commodity));
        }




    }
}

package assignments.medium.shoppingcart.src.tests;

import assignments.medium.shoppingcart.src.main.Customers.Customer;
import assignments.medium.shoppingcart.src.main.Customers.EWallet;
import assignments.medium.shoppingcart.src.main.commodities.Apple;
import assignments.medium.shoppingcart.src.main.commodities.Milk;
import assignments.medium.shoppingcart.src.main.shopUtils.ShoppingUtils;
import assignments.medium.shoppingcart.src.main.shopUtils.Validations;

public class DemoTests {
    static Apple globalApple = new Apple();
    public static void main(String args[]){
        //static Apple apple = new Apple();
        Customer rsharit = new Customer();

        rsharit.setName("Rajender Singh Harit");
        rsharit.setWallet(new EWallet());
        rsharit.getWallet().setWalletValue(500);
        rsharit.getPurchase().put("Apple", 3);
        rsharit.getPurchase().put("Milk", 2);





//        Apple a1 = new Apple();
//        Apple a2 = new Apple();
//        Milk m1 = new Milk();
        ShoppingUtils su = new ShoppingUtils();
        su.calculateBill(rsharit);
        //su.checkIfAvailable(3, a1);
        //su.checkIfAvailable(3, m1);



        System.out.println();



    }
}

package assignments.medium.shoppingcart.src.main.Customers;

import java.util.HashMap;

public class Customer {
    private String name;
    private EWallet wallet;
    private HashMap<String, Integer> purchase = new HashMap<>();

    public HashMap<String, Integer> getPurchase() {
        return purchase;
    }

    public void setPurchase(HashMap<String, Integer> purchase) {
        this.purchase = purchase;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EWallet getWallet() {
        return wallet;
    }

    public void setWallet(EWallet wallet) {
        this.wallet = wallet;
    }
}

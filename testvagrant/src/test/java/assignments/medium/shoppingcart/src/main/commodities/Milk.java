package assignments.medium.shoppingcart.src.main.commodities;

/**
 * Final Milk class
 */
public class Milk extends BaseCommodity{
    private static int price = 10;
    final private String name = "Milk";
    private static int quantity = 100;

    private Milk globalMilk =null;

    public Milk getGlobalMilk(){
        if (globalMilk ==null)
            return new Milk();
        else
            return globalMilk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

package assignments.medium.shoppingcart.src.main.commodities;

/**
 * Final Apple class
 */
public final class Apple extends BaseCommodity{
    private static int price = 50;
    final private String name = "Apple";
    private static int quantity = 100;

    private Apple globalApple =null;

    public Apple getGlobalApple(){
        if (globalApple ==null)
            return new Apple();
        else
            return globalApple;
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

package assignments.medium.shoppingcart.src.main.commodities;

/**
 * Final Newspaper class
 */
public class NewsPaper extends BaseCommodity{
    private int price = 2;
    final private String name = "NewsPaper";
    private static int quantity = 50;


    private NewsPaper globalNewspaper =null;

    public NewsPaper getGlobalNewspaper(){
        if (globalNewspaper ==null)
            return new NewsPaper();
        else
            return globalNewspaper;
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

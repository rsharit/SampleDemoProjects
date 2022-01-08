package assignments.medium.shoppingcart.src.main.shopCustomedException;

/**
 * Custom exception
 */
public class CommodityNotAvailable extends Exception{
    public CommodityNotAvailable(String errorMessage){
        super(errorMessage);
    }
}

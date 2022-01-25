package assignments.easy.GST.src.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private boolean isGSTApplicable(GSTProduct product){
        return product.isGSTApplicable();
    }

    public boolean isProductMoreThanSpecifiedAmount(GSTProduct product, double price){
        double actualPrice = product.getPrice();
        if (product.isGSTApplicable()){
            if (product instanceof Edible)
                actualPrice = product.getPrice() +
                        ((Edible) product).getGstRate()*18/100;
            else if (product instanceof Electric)
                actualPrice = product.getPrice() +
                        ((Electric) product).getGstRate()*18/100;
        }
        return actualPrice> price;
    }

    public double generateBill(Customer customer){
        /**
         * not required at the moment
         * but fetch customers product list
         * iterate for each product
         * check if product is GST applicable or not
         * if GST applicable do calculation for this product to get selling rate
         * else price is set actual rate
         * do the sum of all the total
         */
        return 0;
    }

    public List<GSTProduct> getGSTApplicableProducts(Customer customer){
        List<GSTProduct> gstApplicableProducts = new ArrayList<>();

        for (GSTProduct product : customer.getCustomerProducts()){
            if(product.isGSTApplicable())
                gstApplicableProducts.add(product);
        }
        return gstApplicableProducts;
    }

    public List<GSTProduct> getGSTInapplicableProducts(Customer customer){
        List<GSTProduct> gstInapplicableProducts = new ArrayList<>();

        for (GSTProduct product : customer.getCustomerProducts()){
            if(product.isGSTApplicable())
                gstInapplicableProducts.add(product);
        }
        return gstInapplicableProducts;
    }
}

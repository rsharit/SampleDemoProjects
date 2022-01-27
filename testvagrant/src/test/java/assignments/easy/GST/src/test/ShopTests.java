package assignments.easy.GST.src.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ShopTests {

    @Test()
    public void ifProductIsApplicableForGST(){
        //Arrange
        Customer customer1 = new Customer();
        Shop shopUtils = new Shop();
        customer1.getCustomerProducts().add(customer1.getEdibleProduct("CookingOil", 149.9));
        customer1.getCustomerProducts().add(customer1.getEdibleProduct("Flour", 300));
        customer1.getCustomerProducts().add(customer1.getEdibleProduct("Cookie", 50));
        customer1.getCustomerProducts().add(customer1.getElectricProduct("MI Mobile", 4000.9));
        customer1.getCustomerProducts().add(customer1.getElectricProduct("MI TV", 14000.9));

        //Act
        List<GSTProduct> expectedProducts = shopUtils.getGSTApplicableProducts(customer1);
        //Assert
        for (int i = 0; i<expectedProducts.size(); i++)
            Assert.assertEquals(expectedProducts.get(i).isGSTApplicable(), true);

    }

    @Test()
    public void ifProductMoreThan2000(){
        //Arrange
        Customer customer1 = new Customer();
        Shop shopUtils = new Shop();

        customer1.getCustomerProducts().add(customer1.getEdibleProduct("CookingOil", 149.9));
        customer1.getCustomerProducts().add(customer1.getEdibleProduct("Flour", 300));
        customer1.getCustomerProducts().add(customer1.getEdibleProduct("Cookie", 50));
        customer1.getCustomerProducts().add(customer1.getElectricProduct("MI Mobile", 4000.9));
        customer1.getCustomerProducts().add(customer1.getElectricProduct("MI TV", 14000.9));

        //Act
        int expectedProducts = 0;
        for(GSTProduct product: customer1.getCustomerProducts()){
            if (shopUtils.isProductMoreThanSpecifiedAmount(product, 2000))
                expectedProducts++;
        }
        //Assert if price of two products is larget than 2000 including GST
        Assert.assertEquals(expectedProducts, 2);

    }
}

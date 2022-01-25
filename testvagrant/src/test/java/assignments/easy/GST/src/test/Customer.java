package assignments.easy.GST.src.test;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Customer {
     private List<GSTProduct> customerProducts = new ArrayList<>();

    public GSTProduct getElectricProduct(String name, double price){
        return new Electric(name, price);
    }

    public GSTProduct getEdibleProduct(String name, double price){
        return new Edible(name, price);
    }
}

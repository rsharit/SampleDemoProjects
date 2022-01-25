package assignments.easy.GST.src.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edible extends GSTProduct{
    double gstRate = 0;
    boolean isGSTApplicable = false;

    Edible(){
        //setGSTApplicable(false);
    }

    Edible(String name, double price){
        //setGSTApplicable(false);
        this.name = name;
        setPrice(price);
    }
}

package assignments.easy.GST.src.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Electric extends GSTProduct{
    double gstRate = 18;
    boolean isGSTApplicable = true;

    Electric(){
    //    setGSTApplicable(true);
    }

    Electric(String name, double price){
    //    setGSTApplicable(true);
        this.name=name;
        setPrice(price);
    }
}

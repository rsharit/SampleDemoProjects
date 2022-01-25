package assignments.easy.GST.src.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GSTProduct {
    String name;
    private boolean isGSTApplicable;
    private double price;
    String type; /* basically type tells edible, electric etc*/
}

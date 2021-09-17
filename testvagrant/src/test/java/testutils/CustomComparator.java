package testutils;

public class CustomComparator {

    public boolean comparePermissibleRange(Double value1, Double value2, Double range){
        if (value1>value2)
            return (value1 - value2) <= range;
        else
            return (value2 - value1) <= range;
    }

}

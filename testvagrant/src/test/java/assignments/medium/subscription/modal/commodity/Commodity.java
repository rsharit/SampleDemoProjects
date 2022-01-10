package assignments.medium.subscription.modal.commodity;

import assignments.medium.subscription.modal.helpers.DayDateUnit;

import java.util.ArrayList;
import java.util.List;

public class Commodity extends CommodityType{
    String name;
    List<DayDateUnit> subscribedDates = new ArrayList<>();
}

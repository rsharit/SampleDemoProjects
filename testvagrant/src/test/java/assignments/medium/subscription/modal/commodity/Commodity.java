package assignments.medium.subscription.modal.commodity;

import assignments.medium.subscription.modal.helpers.DayDateUnit;

import java.util.ArrayList;
import java.util.List;

public class Commodity extends CommodityType{
    String name;
    List<DayDateUnit> subscribedDates = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DayDateUnit> getSubscribedDates() {
        return subscribedDates;
    }

    public void setSubscribedDates(List<DayDateUnit> subscribedDates) {
        this.subscribedDates = subscribedDates;
    }
}

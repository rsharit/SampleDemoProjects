package assignments.medium.subscription.modal.helpers.CommodityHelper;

import assignments.medium.subscription.modal.commodity.Commodity;
import assignments.medium.subscription.modal.customers.Customer;
import assignments.medium.subscription.modal.helpers.CustomerHelper.CustomerUtils;
import assignments.medium.subscription.modal.helpers.DayDateUnit;

import java.util.Date;

public class CommodityUtils {

    public Commodity getCommodity(String category, String subCategory, String name, Date date){
        Commodity commodity = new Commodity();
        commodity.getSubscribedDates().add(new DayDateUnit(date));
        commodity.setName(name);
        commodity.setSubCategory(subCategory);
        commodity.setCategory(category);

        return commodity;
    }
}

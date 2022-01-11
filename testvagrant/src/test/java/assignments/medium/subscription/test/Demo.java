package assignments.medium.subscription.test;

import assignments.medium.subscription.modal.commodity.Commodity;
import assignments.medium.subscription.modal.customers.Customer;
import assignments.medium.subscription.modal.helpers.CommodityHelper.CommodityUtils;
import assignments.medium.subscription.modal.helpers.CustomerHelper.CustomerUtils;
import assignments.medium.subscription.modal.helpers.DayDateUnit;
import org.apache.juneau.serializer.SerializeException;
import utils.serializer.Serializer;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws SerializeException {
        CustomerUtils customerUtils = new CustomerUtils();
        CommodityUtils commodityUtils = new CommodityUtils();
        Customer customer1 = customerUtils.createCustomer();
        Commodity commodity1 = new Commodity();
        Commodity commodity2 = new Commodity();
        commodity1.getSubscribedDates().add(new DayDateUnit());
        commodity2.getSubscribedDates().add(new DayDateUnit());
        commodity1.setName("Toi");
        commodity2.setName("HT");
        commodity1.setSubCategory("Newspaper");
        commodity1.setCategory("BooksAndPeriodicals");
        commodity2.setSubCategory("Newspaper");
        commodity2.setCategory("BooksAndPeriodicals");

        Commodity commodity3 = commodityUtils.getCommodity("BooksAndPeriodicals",
                "NewsPaper", "EconomicTimes", new Date());




        List<Commodity> commodityList = new ArrayList<>();
        commodityList.add(commodity1);
        commodityList.add(commodity2);
        commodityList.add(commodity3);
        customer1.getCommodities().put("NewsPaper", commodityList);

        Serializer serializer = new Serializer();
        String jsonString = serializer.getJsonString(customer1);


        System.out.println();
        ;

    }
}

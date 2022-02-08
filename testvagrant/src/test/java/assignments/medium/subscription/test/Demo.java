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

        Commodity commodity1 = commodityUtils.getCommodity("BooksAndPeriodicals",
                "NewsPaper", "TOI", new Date());

        Commodity commodity2 = commodityUtils.getCommodity("BooksAndPeriodicals",
                "NewsPaper", "HT", new Date());

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

package assignments.medium.subscription.modal.helpers.DateFilterhelpers;

import assignments.medium.subscription.modal.commodity.Commodity;
import assignments.medium.subscription.modal.customers.Customer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface DateFilterUtilsI {

    public Date setDate(int month, int day, int year);

    public List<Commodity> getWeeklyCommodityFromDate(Customer customer, Date date);

    public List<Commodity> getWeeklyCommodityExcludingWeekendFromDate(Customer customer, Date date);

    public List<Commodity> getBiWeeklyCommodityFromDate(Customer customer, Date date);

    public List<Commodity> getBiWeeklyCommodityExcludingWeekendFromDate(Customer customer, Date date);

}

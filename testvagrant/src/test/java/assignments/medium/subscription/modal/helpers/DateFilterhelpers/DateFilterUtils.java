package assignments.medium.subscription.modal.helpers.DateFilterhelpers;

import assignments.medium.subscription.modal.commodity.Commodity;
import assignments.medium.subscription.modal.customers.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.List;

public class DateFilterUtils implements  DateFilterUtilsI{

    public Date setDate(int month, int day, int year){

        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, month);
        c1.set(Calendar.DATE, day);
        c1.set(Calendar.YEAR, year);

        // creating a date object with specified time.
        Date date = c1.getTime();
        return date;
    }

    public List<Commodity> getWeeklyCommodityFromDate(Customer customer, Date date){
        /**
         * iterate list of commodity and return list of commodity
         */
        return new ArrayList<Commodity>();
    }

    public List<Commodity> getWeeklyCommodityExcludingWeekendFromDate(Customer customer, Date date){
        /**
         * update logic here
         */
        return new ArrayList<Commodity>();
    }

    public List<Commodity> getBiWeeklyCommodityFromDate(Customer customer, Date date){
        /**
         * update logic here
         */
        return new ArrayList<Commodity>();
    }

    public List<Commodity> getBiWeeklyCommodityExcludingWeekendFromDate(Customer customer, Date date){
        /**
         * update logic here
         */
        return new ArrayList<Commodity>();
    }



}

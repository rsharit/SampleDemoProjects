package assignments.medium.subscription.modal.helpers;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class DayDateUnit {
    Date date;
    String day;

    public DayDateUnit(){
        this.date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        this.day = new SimpleDateFormat("EEEE").format(date);
    }
    public DayDateUnit(Date date){
        this.date = date;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        this.day = new SimpleDateFormat("EEEE").format(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

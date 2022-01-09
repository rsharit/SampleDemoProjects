package assignments.medium.hospital.src.main.PatientInfo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomisedDate {
    Date currentDate = new Date();
    SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MMM/yyyy");
    String dateOnly = dateFormat.format(currentDate);

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getDateOnly() {
        return dateOnly;
    }

    public void setDateOnly(String dateOnly) {
        this.dateOnly = dateOnly;
    }
}

package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DateExamples {

    public static void main(String []args) {

        //Get the current date & Tie
        Date today = new Date();
        System.out.println("Current aDte is "+today);

        Date todayInDifferentWay = Calendar.getInstance().getTime();
        System.out.println("Current Date is(same date in using a different way "+todayInDifferentWay);

        //Get the name without time
        LocalDate.now();
        System.out.println("Local Date is (Date Without Time) "+LocalDate.now());

        //Get the name without time
        LocalTime.now();
        System.out.println("Local Time is "+LocalTime.now());

        //Get the end date of current month
        LocalDate EndDateOfCurrentMonthBeforeFormat=LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Month End Date is "+EndDateOfCurrentMonthBeforeFormat);

        //Format the date
        String EndDateOfCurrentMonth = EndDateOfCurrentMonthBeforeFormat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Month End Date after formatted :"+EndDateOfCurrentMonth);

    }
}

package CW;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateNDays {


    public static String dateNDays(double a0, double a, double p) {
        LocalDate d = LocalDate.of(2016, 1, 1);
        while(a0 < a){
            a0 += a0 * (p /3600);
            d = d.plusDays(1);
        }
        return d.toString();
    }

    public static void main(String[] args) {
        System.out.println(dateNDays(100, 150, 2.00));
    }
}

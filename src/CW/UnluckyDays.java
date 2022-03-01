package CW;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.GregorianCalendar;

public class UnluckyDays {
    public static int unluckyDays(int year) {
        int amountOfFridays13 = 0;
        for (int month = 1; month < 13; month++) {
            LocalDate day13 = LocalDate.of(year, month, 13);
            if (day13.getDayOfWeek() == DayOfWeek.FRIDAY) {
                amountOfFridays13++;
            }
        }
        return amountOfFridays13;
    }

    public static void main(String[] args) {
        System.out.println(unluckyDays(2015));
        System.out.println(unluckyDays(1986));
    }
}

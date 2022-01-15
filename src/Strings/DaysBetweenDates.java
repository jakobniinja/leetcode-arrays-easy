package Strings;

public class DaysBetweenDates {
    private static int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int daysBetweenDates(String date1,String date2 ) {
        return Math.abs(from1971(date1) - from1971(date2));
    }

    private static int from1971(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]), month = Integer.parseInt(parts[1]), day = Integer.parseInt(parts[2]);
       int count = day;

       for(int i =1971; i< year; i++) count +=(isLeapYear(i)) ? 366:365;
       for(int i =0; i< month -1; i++)count += months[i];
       if(month> 2 && isLeapYear(year)) count +=1;
       return count;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 ==0 || (year % 100 != 0 && year % 4 ==0 );
    }

    public static void main(String[] args) {
        String date1= "2020-01-15", date2= "2019-12-31";
        System.out.println(daysBetweenDates(date1, date2));
    }
}

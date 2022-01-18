package Strings;

public class DayOfTheYear {
    public static int dayOfTheYear(String date ) {
             String[] arr = date.split("-", 3);
        int year = Integer.parseInt(arr[0]);
        int mon = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);
        int count[] =new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int daynum = day;
        for(int i = 0; i < mon - 1; i++)
            daynum += count[i];
        if(mon > 2 && isLeap(year))
            daynum++;
        return daynum;
}

    private static boolean isLeap(int year) {
        return year % 400 ==0 || (year % 100 !=0 || year %4 ==0 );
    }

    public static void main(String[] args) {
        String s = "2019-02-10";
        System.out.println(dayOfTheYear(s));
    }

    }

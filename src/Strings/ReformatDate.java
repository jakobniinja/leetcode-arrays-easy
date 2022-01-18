package Strings;

public class ReformatDate {
    public static String reformatDate(String date) {
               String month[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int space=date.indexOf(' ');
        for (int i = 0; i < month.length; i++) {
            if (date.substring(space + 1, space + 4).equals(month[i])) {
                if (i < 9) {
                    if (Character.isDigit(date.charAt(1)))
                        return date.substring(space + 5) + "-" + 0 + (i + 1) + "-" + date.substring(0, 2);
                    else
                        return date.substring(space + 5) + "-" + 0 + (i + 1) + "-" + 0 + date.charAt(0);
                } else {
                    if (Character.isDigit(date.charAt(1)))
                        return date.substring(space + 5) + "-" + (i + 1) + "-" + date.substring(0, 2);
                    else
                        return date.substring(space + 5) + "-" + (i + 1) + "-" + 0 + date.charAt(0);
                }
            }
        }
        return " ";
    }

    public static void main(String[] args) {
        String s ="6th Jun 1933";
        System.out.println(reformatDate(s));
    }
}

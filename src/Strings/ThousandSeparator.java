package Strings;

public class ThousandSeparator {
    public static String thousandSeparator(int n) {
        if(n < 1000)
            return String.valueOf(n);
        int d = n /1000;
        int r = n %1000;

        StringBuilder sb = new StringBuilder();

        sb.append(thousandSeparator(d));
        sb.append(".");
        if(r< 10){
            sb.append(0);
            sb.append(0);
        }else if (r < 100)
            sb.append(0);
        sb.append(r);
        return sb.toString();
    }

    public static void main(String[] args) {
        int n =100000;
        System.out.println(thousandSeparator(n));
    }
}

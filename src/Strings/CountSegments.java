package Strings;

public class CountSegments {
    public static int  countSegments(String s ) {
        int L = s.length();
        int count =0, i =0;

        if (s.length() > 0) {
            while (i < L) {
                if(i==L-1 && s.charAt(i) == ' ')
                    break;
                if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ' )
                    count ++;
                i++;
            }
            if(s.charAt(0) != ' ')
                count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "               ";
        System.out.println(countSegments(s));
    }
}

package Strings;

public class ReverseString {
    public static char[] reverseString(char[] s) {
        int i =0, j = s.length -1;

        while(i< j){
            char tmp = s[i];
            s[i] =s[j];
            s[j] =tmp;
        }
        return s;
    }

    public static void main(String[] args) {
        char[] s =  {'h','e', 'l', 'l', 'o'} ;
        System.out.println(reverseString(s));
    }
}

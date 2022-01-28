package CW;

public class ReverseString {
    public static String reverseString(String s) {


        char[] arr  =s.toCharArray();
        StringBuilder sb  =new StringBuilder();

        for(char ch : arr){
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}

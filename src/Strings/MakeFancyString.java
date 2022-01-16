package Strings;


public class MakeFancyString {
    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count =1;

        sb.append(s.charAt(0));
        for(int i =1; i< s.length(); i++ ){
            if(s.charAt(i-1)== s.charAt(i))
                count++;
            else
                count =1;
            if(count <3)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }
}

package Strings;

public class ReplaceDigits {
    public static String   replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int n = Integer.parseInt(s.charAt(i)+"");
                sb.append((char)(s.charAt(i-1)+n));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        System.out.println(replaceDigits(s));
    }
}

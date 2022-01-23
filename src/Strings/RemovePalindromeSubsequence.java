package Strings;

public class RemovePalindromeSubsequence {
    public static int removePalindromeSubsequence(String s) {
        int start = 0;
        int end =s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return 2;
            }else {
                start ++;
                end --;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String s = "ababa";
        System.out.println(removePalindromeSubsequence(s));
    }
}

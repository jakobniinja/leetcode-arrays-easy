package Strings;

public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int[] prefix = kmp(s);
        if(prefix[prefix.length -1] > 0 && s.length() % (s.length() - prefix[prefix.length -1] ) == 0)
            return true;
        return false;
    }

    private static int[] kmp(String p) {
        int[] prefix = new int[p.length()];
        int left = 0, right =1;
        while(right < p.length()){
            if(p.charAt(left) == p.charAt(right)){
                prefix[right] = left +1;
                left ++;
                right ++;
            }else if (left >0) {
                left = prefix[left-1];
            }else {
                right ++;
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String s = "ababa";

        System.out.println(repeatedSubstringPattern(s));
    }
}

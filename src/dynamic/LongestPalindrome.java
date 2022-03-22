package dynamic;

public class LongestPalindrome {
    public static String longestPalindrome(String s ) {
        if(s == null || s.isEmpty()) return "";

        final int sLen = s.length();
        int longest = 0, left =0;

        for (int i = 0; i <sLen; i++) {
            for (int j = i; j < sLen; j++) {
                if( j -i +1 > longest && isPalindrome(s, i, j)){
                    longest = j -i +1;
                    left =1;
                }
            }
            
        }
        return s.substring(left, left + longest);

    }

    private static boolean isPalindrome(String s, int left, int right){
        for (int i = left, j = right; i <= right; i++, j--) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar", 0,6 ));
        System.out.println(longestPalindrome("babad"));
    }
}

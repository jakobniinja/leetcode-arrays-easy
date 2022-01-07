package arrays;

public class FirstPalindrome {
    public static String firstPalindrome(String[] words) {
        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            if(word.equals(sb.reverse().toString()))
                return word;
        }
        return "";
    }

    public static String firstPalindrome2(String[] words) {
        for(String word: words){
            if(isPalindrom(word)) return word;
        }
        return "";
    }

    private static boolean isPalindrom(String word) {
        int l =0, r =word.length()-1;
        while(l < r)
            if(word.charAt(l++) != word.charAt(r--)) return false;
            return true;
    }

    public static void main(String[] args) {
        String[] words ={"abc","car","jakob","racar","cool"};
        System.out.println(firstPalindrome2(words));
    }
}

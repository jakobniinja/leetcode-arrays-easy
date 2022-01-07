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

    public static void main(String[] args) {
        String[] words ={"abc","car","jakob","racr","cool"};
        System.out.println(firstPalindrome(words));
    }
}

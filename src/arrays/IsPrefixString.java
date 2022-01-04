package arrays;

public class IsPrefixString {
    public static boolean isPrefixString(String s, String[] words) {
       String word ="";
        for( int i =0; i < words.length; i++){
            word += words[i];
            if(s.equals(word))
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        String[] words ={"apples","i","love","leetcode"};
        System.out.println(isPrefixString("iloveleetcode", words));
    }
}

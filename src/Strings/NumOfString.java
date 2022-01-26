package Strings;

public class NumOfString {
    public static int numOfString(String[] pattern, String word) {
        int count =0;
        for (int i = 0; i < pattern.length; i++) {
            String s = pattern[i];
            if(word.contains(s))
                count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] s = {"a", "abc", "bc,", "d"};
        System.out.println(numOfString(s, "abc"));
    }
}

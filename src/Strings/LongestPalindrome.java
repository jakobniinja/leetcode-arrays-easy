package Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!map.containsKey((ch)))map.put(ch,1);
            else {
                map.remove(ch);
                counter += 2;
            }
        }
        if(counter < s.length()) counter ++;
        return counter;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

}

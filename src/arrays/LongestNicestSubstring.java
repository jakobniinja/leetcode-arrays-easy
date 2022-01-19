package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestNicestSubstring {
    public static String  longestNicestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        for(int i =0; i< s.length(); i++){
            set.add(s.charAt(i));
        }
        for(int i =0; i< s.length(); i++){
            if(set.contains(Character.toUpperCase(s.charAt(i)))
           && set.contains(Character.toLowerCase(s.charAt(i)))
            )
                continue;
            String s1= longestNicestSubstring(s.substring(0,i));
            String s2= longestNicestSubstring(s.substring(i+1));
            return s1.length() >= s2.length() ? s1: s2;
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "b";
        System.out.println(longestNicestSubstring(s));
    }

}

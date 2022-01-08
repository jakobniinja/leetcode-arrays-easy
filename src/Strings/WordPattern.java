package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        String[] sArr = s.split(" ");
        if(pattern.length() != sArr.length )  return false;
        for( int i =0; i< pattern.length(); i++){

            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(sArr[i]))return false;
            }else{
                if(!set.add(sArr[i])) return false;
                map.put(c, sArr[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern ="aaaa";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}

package Strings;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveChar {
    public static int consecutiveChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int len = s.length();
        int max = 1;
        char[] arr = s.toCharArray();
        char p = ' ';
        int tempMax = 0;

        for (char c : arr) {
            if (!map.containsKey(c))
                map.put(c, 1);
            if (map.containsKey(c) && p != c) {
                if (map.get(c) > tempMax) tempMax = map.get(c);
                map.put(c, 1);
            }
            if (p == c)
                map.put(c, map.get(c) + 1);
            else {
                p = c;
            }
        }
        if(map.get(p) < tempMax)
            map.put(p,tempMax);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +  " =>  " + entry.getValue());
        }
        for(Integer val : map.values()){
            if(val > max ) max = val;
        }
        return Math.max(max, tempMax);
    }


    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        System.out.println(consecutiveChar(s));
    }

}

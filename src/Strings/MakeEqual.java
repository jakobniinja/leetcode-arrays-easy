package Strings;

import java.util.HashMap;
import java.util.Map;

public class MakeEqual {
    public static boolean makeEqual(String[] words ) {
        Map<Character, Integer> map  = new HashMap<>();

        for(String str : words){
           for(int i =0; i< str.length(); i++){
               char ch = str.charAt(i);
               map.put(ch, map.getOrDefault(ch, 0)+1);
           }
        }
        for(Character key : map.keySet()){
            int freq = map.get(key);
            if(freq% words.length!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] s = {"ab", "a"};
        System.out.println(makeEqual(s));
    }
}

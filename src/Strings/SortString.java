package Strings;

import java.util.HashMap;
import java.util.Map;

public class SortString {
    public static String sortString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        while(map.size() > 0){
            for(int i =0; i< 26; i++){
                char ch = (char) (97+i);
                if(map.containsKey(ch)){
                    sb.append(ch);
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch) ==0) map.remove(ch);
                }
            }
            for(int i =25; i>=0; i--  ){
                char ch = (char) (97+i);
                if(map.containsKey(ch)){
                    sb.append(ch);
                    map.put(ch, map.get(ch)-1);
                    if(map.get(ch) ==0) map.remove(ch);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "t";
        System.out.println(sortString(s));
    }


}

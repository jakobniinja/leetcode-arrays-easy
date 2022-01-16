package Strings;

import java.util.Collections;
import java.util.HashMap;

public class MaxNumOfBallons {
    public static int maxNumOfBallons(String text) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : "balon".split("")){
            int charCount = text.length() - text.replace(s, "").length();
            if(s.equals("l") ||s.equals(("o"))){
                charCount = charCount/2;
            }
            map.put(s,charCount);
        }
        int min = Collections.min(map.values());
        return min;

    }

    public static void main(String[] args) {
        String s = "nlaebolko";
        System.out.println(maxNumOfBallons(s));
    }
}

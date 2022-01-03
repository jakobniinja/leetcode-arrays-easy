package arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountMatches {
    public static int  countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
        int counter = 0;

        for( List<String> list : items){
            if(list.get(map.get(ruleKey)).equals(ruleValue))
                counter ++;
        }
        return counter;
    }
}

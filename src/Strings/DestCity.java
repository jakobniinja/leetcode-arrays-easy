package Strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestCity {
    public static String  destCity(List<List<String>> paths) {
        Map<String,Integer> map = new HashMap<>();
        for(List<String> ls: paths)
            map.put(ls.get(0), map.getOrDefault(ls.get(0), 0) +1);
        for(List<String> ls : paths)
            for(String s : ls)
                if(!map.containsKey(s))
                    return s;
        return null;
    }

    public static void main(String[] args) {


    }
}

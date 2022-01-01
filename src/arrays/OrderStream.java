package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderStream {
    Map<Integer, String> map;
    int cap, idx;
    public  OrderStream(int n ) {
        map = new HashMap<>();
        cap =n ;
        idx =1;
    }

    public List<String> insert(int idKey, String value){
        if(idKey > cap  || idKey< 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        map.put(idKey, value);
        if(idKey == idx){
            while(map.containsKey(idx)){
                res.add(map.get(idx));
                idx++;
            }
        }
        return res;
    }
}

package CW;

import java.util.ArrayList;
import java.util.Collections;

public class WarnTheSheep {
    public static String  warnTheSheep(String[]  arr) {

//       create a sb
        int n  = arr.length;
        ArrayList<String> list = new ArrayList<>();

        for(String s : arr){
           list.add(s);
        }
        Collections.reverse(list);
        if(list.get(0) =="wolf") return"Pls go away and stop eating my sheep";

//        reverse sb then loop
        for(int i  =0; i< n; i++){
            if(  list.get(i) != "sheep" && list.get(i) != null)
                return  "Oi! Sheep number "+ i+ "! You are about to be eaten by a wolf!";
        }
//        else Pls go away and stop eating my sheep
        return  "Pls go away and stop eating my sheep";


    }
}

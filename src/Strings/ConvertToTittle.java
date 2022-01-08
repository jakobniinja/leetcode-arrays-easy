package Strings;

import java.util.HashMap;
import java.util.Map;

public class ConvertToTittle {
    public static String convertToTittle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        Map<Integer, Character> dict = new HashMap();

        char c = 'A';
        for(int i  =1; i<= 25; i++){
           dict.put(i, c);
           c++;
        }
        dict.put(0, 'Z');

        int curr = columnNumber;
        while(curr!= 0 ){
            int rem = curr % 26;
            res.append(dict.get(rem));

            if(curr <= 26) break;
            curr = rem ==0 ? curr / 26-1 : curr / 26;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        int s = 28;
        System.out.println(convertToTittle(s));
    }
}

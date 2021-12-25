package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransform {
     public  static int[] arrayRankTransform(int[] arr) {
         int[] temp = Arrays.copyOf(arr, arr.length);
         Map<Integer, Integer> map = new HashMap<>();
         Arrays.sort(temp);

         for (int i = 0; i < temp.length; i++) {
             if(!map.containsKey(temp[i])){
                 map.put(temp[i], map.size()+1);
             }
         }

         for (int i = 0; i < arr.length; i++) {
             arr[i] = map.get(arr[i]);
         }
         return  arr;
    }

    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        System.out.print(Arrays.toString(arrayRankTransform(arr)));
    }

}

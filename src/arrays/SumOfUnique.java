package arrays;

import java.util.HashMap;

public class SumOfUnique {
    public static int sumOfUnique2(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(arr.length);
        int count =0;

        for( int i= 0; i< arr.length; i++){
            if( map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i] )+1);
            }else {
                map.put(arr[i], 1);
            }
        }
        for(Integer i : map.keySet()){
            if(map.get(i) == 1){
                count += i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(sumOfUnique2(arr));
    }
}

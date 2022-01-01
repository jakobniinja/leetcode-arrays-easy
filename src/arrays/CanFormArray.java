package arrays;

import java.util.HashMap;

public class CanFormArray {
    public static boolean  canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for( int i =0; i< arr.length; i++){
            hm.put(arr[i] , i);
        }
        for( int[]i : pieces){
            if(!hm.containsKey(i[0]))
                return false;

            for( int j=1; j< i.length; j++){
                if(!hm.containsKey(i[j]))
                    return false;
                if(hm.get(i[j]) - hm.get(i[j-1]) != 1)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr= {91,4,64,78};
        int[][] pieces = {{78}, {4,64}, {91}};
        System.out.println(canFormArray(arr, pieces));
    }
}

package arrays;

import java.util.HashMap;
import java.util.Map;

public class NumIdenticalParis {
    public static int numIdenticalParis(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       int count = 0;

       for( int n : nums){
           if(!map.containsKey(n)){
               map.put(n,0);
           }else map.put(n,map.get(n)+1);
           count += map.get(n);
       }
       return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.print(numIdenticalParis(nums));
    }
}

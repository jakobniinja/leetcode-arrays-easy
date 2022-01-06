package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MaxSubsequence {
    public static int[]  maxSubsequence(int[] nums , int k) {
        int[] tmp = nums.clone();
        Arrays.sort(tmp);

        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i =tmp.length -k; i <tmp.length; i++){
            map.put(tmp[i], map.getOrDefault(tmp[i], 0) +1);
        }
        int[] res = new int[k];
        int count =0;

        for(int i =0; i< nums.length; i++){
            if(map.get(nums[i]) != null && map.get(nums[i]) != 0){
                res[count] = nums[i];
                map.put(nums[i], map.get(nums[i])-1);
                count ++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums ={-1,-2,3,4};
        System.out.println(Arrays.toString(maxSubsequence(nums, 3)));
    }
}

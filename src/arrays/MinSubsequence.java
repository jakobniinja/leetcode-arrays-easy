package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubsequence {
    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;

        for( int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int sum1 = 0;
        int i = nums.length-1;
        while (sum >= sum1){
            sum -=nums[i];
            sum1+=nums[i];
            list.add(nums[i]);
            i--;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,10,9,8};
        System.out.println(minSubsequence(nums));
    }
}

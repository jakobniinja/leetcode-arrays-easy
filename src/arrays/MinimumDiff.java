package arrays;

import java.util.Arrays;

public class MinimumDiff {
    public static int minimumDiff(int[] nums , int k) {
        if(nums.length ==1 ) return 0;

        Arrays.sort(nums);
        int minDiff= Integer.MAX_VALUE;
        for( int i =k-1; i< nums.length; i++){
            minDiff = Math.min(minDiff, nums[i] - nums[i-k+1]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        System.out.println(minimumDiff(nums, 2));
    }
}

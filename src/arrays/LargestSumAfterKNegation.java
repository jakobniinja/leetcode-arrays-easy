package arrays;

import java.util.Arrays;

public class LargestSumAfterKNegation {
    public static int  largestSumAfterKNegation( int[] nums, int k ) {
        while(k != 0){
            Arrays.sort(nums);
            nums[0] = nums[0]* (-1);
           k--;
        }

        int sum  =0;
        for( int x : nums){
            sum+=x;
        }
       return sum;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,-9, 0,0};
        System.out.print(largestSumAfterKNegation(nums, 1));
    }
}

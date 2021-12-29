package arrays;

import java.util.Arrays;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length-1;

        int max = nums[n];
        int sMax = nums[n-1];

        return (max -1) * (sMax -1);

    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.print(maxProduct(nums));
    }
}

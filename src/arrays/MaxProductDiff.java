package arrays;

import java.util.Arrays;

public class MaxProductDiff {
    public static int maxProductDiff(int[] nums ) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length -1;

        return nums[end] * nums[end -1] - (nums[start] * nums[start +1]);
    }

    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDiff(nums));
    }
}

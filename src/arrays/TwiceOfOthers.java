package arrays;

import java.util.Arrays;

public class TwiceOfOthers {
    public static int twiceOfOthers(int[] nums) {
        int foundIndex;
        Arrays.sort(nums);
        int n = nums.length - 1;
        return nums[n] >= nums[n - 1] * 2 ? n : -1;
    }

    public static int twiceOfOthersII(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > max) {
                secondMax = max;
                max = nums[j];
                i = j;
            } else if (nums[j] > secondMax) {
                secondMax = nums[j];
            }
        }
        if (max >= secondMax * 2) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.print(twiceOfOthersII(nums));
    }
}

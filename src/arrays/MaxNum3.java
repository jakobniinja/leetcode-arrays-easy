package arrays;

import java.util.Arrays;

public class MaxNum3 {
    public static int maxNum3(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = nums.length-1 ; 0 < i; i--) {
            sum += nums[i];
        }
        return sum;

    }


    public static void main(String[] args) {
        int[] nums = {-1,8,-3,5};
        System.out.print(maxNum3(nums));
    }


}

package arrays;

import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums ) {
             int[] list = new int[nums.length];
        int total= 0;

        for( int i =0; i < nums.length; i++) {
            total += nums[i];
            list[i] = total;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.print(Arrays.toString(runningSum(nums)));
    }
}

package arrays;

import java.util.Arrays;

public class LargestPerimeter {
    public static int  largestPerimeter( int[] nums) {
        Arrays.sort(nums);
        int m = nums.length;
        for (int i = m - 1; i > 1; --i)
            if (nums[i] < nums[i - 1] + nums[i - 2])
                return nums[i] + nums[i - 1] + nums[i - 2];
        return 0;
    }

    public static void main(String[] args) {
        int[] nums ={3,2,3,4};
        System.out.println(largestPerimeter(nums));
    }
}

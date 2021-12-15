package arrays;

import java.util.Arrays;

public class SetMismatch {
    public static int[] setMismatch(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1] ){
                int temp = nums[i+1];
                nums[i+1] = nums[i] +1;
               nums[i] = temp;
               return new int[]{nums[i], nums[i] +1 };
            }

        }
       return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] nums = {3,4,4,6,};
        System.out.println(Arrays.toString(setMismatch(nums)));
        int[] nums2 = {1,2};
        System.out.println(Arrays.toString(setMismatch(nums2)));
        int[] nums3 = {1,2,2,4};
        System.out.println(Arrays.toString(setMismatch(nums3)));
    }
}

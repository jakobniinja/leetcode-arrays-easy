package arrays;

import java.util.Arrays;

public class ContainsDuplicate {
    public  static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        int count= 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1] )return true;
            count++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1, };
        System.out.print(containsDuplicate(nums));
    }
}

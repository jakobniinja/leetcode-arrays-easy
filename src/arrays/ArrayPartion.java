package arrays;


import java.util.Arrays;

public class ArrayPartion {
    public static int arrayPartion(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length -1; i+= 2) {
            sum +=nums[i];
        }
       return sum;
    }
}

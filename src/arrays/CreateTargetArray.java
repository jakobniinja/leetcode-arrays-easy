package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static int[]  createTargetArray(int[] nums , int[] index) {
        ArrayList<Integer> res = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int resIdx = index[i];
            res.add(resIdx, nums[i]);
        }
        int[] arr = res.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] idx = {0,1,2,2,1};
        System.out.print(Arrays.toString(createTargetArray(nums, idx)));
    }
}

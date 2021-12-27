package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurr {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
            int[] ans = nums.clone();
    int count = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    Arrays.sort(nums);

    for(int i=0;i<nums.length;) {
        if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
            hm.put(nums[i], count);
            count = (i + 1);
        }
        i++;
    }

    for(int i=0;i<nums.length;i++)
        ans[i] = hm.get(ans[i]);

    return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}

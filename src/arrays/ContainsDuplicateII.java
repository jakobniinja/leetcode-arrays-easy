package arrays;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsDuplicateII(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (map.containsKey(current) && (i - map.get(current) <= k)) {
                return true;
            } else {
                map.put(current, i);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.print(containsDuplicateII(nums, 1));
    }
}

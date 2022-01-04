package arrays;

import java.util.ArrayList;
import java.util.List;

public class CanBeIncreasing {
    public static boolean canBeIncreasing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    list.add(nums[j]);
                }
            }
            if (isSorted(list)) {
                return true;
            }

        }
        return false;

    }

private static  boolean isSorted(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) >= list.get(i + 1)) {
            return false;
        }
    }
    return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,10,5,7};
        System.out.println(canBeIncreasing(nums));
    }
}

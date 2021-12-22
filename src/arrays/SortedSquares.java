package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSquares {
    public static List<Integer> sortedSquares(int[] nums ) {
        List<Integer > list  = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i] * nums[i]);
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.print(sortedSquares(nums));
    }
}

package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum2 {
    public static int[] TwoSum2(int[] nums, int target)  {
        for (int i = 0; i < nums.length; i++) {
            int  first = nums[i];
            for (int j = 1; j < nums.length; j++) {
                int second = nums[j];
               int  total = first + second;

                if (total == target ) {
                    return new int[]{i, j};

                }
            }

        }
        return null;

    }


    public static void main(String[] args) {
        int[] sum1 = TwoSum2(new int[]{12, 17, 21, 25}, 29);
        System.out.println(Arrays.toString(sum1));

        int[] sum2 = TwoSum2(new int[]{12, 17, 21, 25, -3}, 9);
        System.out.println( Arrays.toString(sum2) );
    }
}

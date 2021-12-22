package arrays;

import java.util.HashSet;
import java.util.Set;

public class RepeatedNTimes {
    public  static int repeatedNTimes( int[] nums ) {
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!s.add(nums[i]))  return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums ={5,1,5,2,5,3,4,4};
        System.out.println(repeatedNTimes(nums));
    }
}

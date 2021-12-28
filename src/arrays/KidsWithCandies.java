package arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] nums, int extraCandy) {
       List<Boolean> list = new ArrayList<>(nums.length);
        int max = 0;

        for( int i = 0; i < nums.length; i++){
             max = Math.max(nums[i], max);
        }
        for( int i = 0; i < nums.length; i ++){
            if(nums[i] + extraCandy >= max) list.add(true);
            else list.add(false);
        }
        return list ;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,1,1,2};
        System.out.print(kidsWithCandies(nums, 1));
    }
}

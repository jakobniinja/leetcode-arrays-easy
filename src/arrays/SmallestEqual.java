package arrays;

import java.util.ArrayList;
import java.util.List;

public class SmallestEqual {
    public static int smallestEqual(int[] nums) {
        List<Integer> al = new ArrayList<>();

        for( int i =0; i< nums.length; i++){
            if(i % 10 == nums[i]){
                al.add(i);
            }
        }
        return al.isEmpty() ? -1 : al.get(0);
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2};
        System.out.println(smallestEqual(nums));
    }
}

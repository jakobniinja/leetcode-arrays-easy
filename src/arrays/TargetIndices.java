package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> al = new ArrayList<>(nums.length);
        
        for(int i =0; i< nums.length; i++){
            if(nums[i]== target){
               al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        System.out.println(targetIndices(nums, 5));
    }
}

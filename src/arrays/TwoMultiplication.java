package arrays;

import java.util.HashSet;

public class TwoMultiplication {


    public static boolean twoMultiplication(int[] nums, int target) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(target % nums[i] == 0 &&  set.contains(nums[i]) ){
                return true;
            }
            set.add(nums[i]);
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] nums ={3,2,-1, 3,4};
        System.out.print(twoMultiplication(nums,4));
    }
}

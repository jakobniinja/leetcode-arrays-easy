package arrays;

import java.util.Arrays;

public class GetConcatenation {
    public static int[]  getConcatenation(int[] nums) {
        int ans [] = new int[2* nums.length];
        for(int i =0; i< nums.length; i++){
            ans[i] =nums[i];
        }
        int idx = nums.length;
        for(int i =0; i< nums.length; i++){
            ans[idx] = nums[i];
            idx ++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums  ={1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}

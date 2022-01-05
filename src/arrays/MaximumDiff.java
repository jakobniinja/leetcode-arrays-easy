package arrays;

public class MaximumDiff {
    public static int maximumDiff(int[] nums ) {
        int ans = -1;
        int small = nums[0];

        for( int i =0; i< nums.length; i++){
            ans = Math.max(ans, (nums[i] - small));
            small = Math.min(small, nums[i]);
        }
        return ans != 0 ? ans : -1;
    }


    public static void main(String[] args) {
        int[] nums = {1,5,2,10};
        System.out.println(maximumDiff(nums));
    }
}

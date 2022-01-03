package arrays;

public class MaxAcsSum {
    public static int maxAcsSum(int[] nums) {
        int curSum, max;
        curSum = max = nums[0];

        for( int i =1; i< nums.length; i++){
            if(nums[i] > nums[i-1]){
                curSum += nums[i];
            }else{
                max = Math.max(max, curSum);
                curSum = nums[i];
            }
        }
        return Math.max(max, curSum);
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxAcsSum(nums));
    }
}

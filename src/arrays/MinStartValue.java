package arrays;

public class MinStartValue {
    public static int minStartValue(int[] nums) {
        int sum = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
           sum += nums[i];
           min = Math.min(sum, min);
        }
        return min > 0 ? 1 : 1 - min;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, -3};
        System.out.println(minStartValue(nums));
    }
}

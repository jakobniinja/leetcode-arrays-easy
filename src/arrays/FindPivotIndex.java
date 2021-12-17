package arrays;

public class FindPivotIndex {
    public static int findPivotIndex(int[] nums) {
        int total_sum = 0;
        for (int i =0; i < nums.length; i++) {
            total_sum += nums[i];
        }
        int left_sum = 0;
        for (int i =0; i< nums.length; i++) {
            if (i != 0) left_sum += nums[i - 1];
            if (total_sum - left_sum - nums[i] == left_sum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.print(findPivotIndex(nums));
    }
}

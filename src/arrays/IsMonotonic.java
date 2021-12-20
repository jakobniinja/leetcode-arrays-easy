package arrays;

public class IsMonotonic {

    public static boolean isMonotonic(int[] nums) {

        boolean monotolicI = nums[0] <= nums[nums.length - 1];
        boolean monotolicD = !monotolicI;


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1] && monotolicI) return false;
            if (nums[i] < nums[i + 1] && monotolicD) return false;
        }

        return true;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(isMonotonic(nums));
    }
}

package arrays;

public class SingelNumber {

    public static int singelNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 1, 4};

        System.out.print(singelNumber(nums));
    }
}

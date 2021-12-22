package arrays;

import java.util.Arrays;

public class SortArrayByPairity {
    public static int[] sortArrayByPairity(int[] nums) {

        int n = nums.length - 1;
        int[] res = new int[n+1];
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (nums[i] % 2 == 0) res[count++] = nums[i];
            else res[n - i] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.print(Arrays.toString(sortArrayByPairity(nums)));
    }
}

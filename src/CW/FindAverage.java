package CW;

import java.util.Arrays;

public class FindAverage {
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum() / nums.length;
    }

    public static void main(String[] args) {
        int[] list = new int[]{1, 3, 5, 7};
        System.out.println(findAverage(list));
    }
}

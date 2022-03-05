package CW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfAllPos {
    public static int sumOfAllPos(int[] nums) {
        return   Arrays.stream(nums).filter(num -> num > 0).sum();
    }

    public static void main(String[] args) {
        int[] list = new int[]{-1,-2,5,-4,15};
        System.out.println(sumOfAllPos(list));
    }
}
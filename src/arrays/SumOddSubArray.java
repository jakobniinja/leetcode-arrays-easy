package arrays;

import java.util.ArrayList;
import java.util.List;

public class SumOddSubArray {
    public static int sumOddSubArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j+=2) {
                for (int k = i; k <= j; k++) {
                   sum += arr[k];
                   list.add(arr[k]);
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10,11,12};
        System.out.println(sumOddSubArray(arr));
    }
}

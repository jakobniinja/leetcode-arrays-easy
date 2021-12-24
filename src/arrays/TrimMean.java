package arrays;

import java.util.Arrays;

public class TrimMean {
    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum =0.0;
        int start = arr.length /20;
        int end = arr.length  - start;

        int c = end - start;

        for (int i = start; i < end; i++) {
            sum+= arr[i];
        }
        return sum /c;
    }

    public static void main(String[] args) {
        int[] arr = {6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4};
        System.out.print(trimMean(arr));
    }
}

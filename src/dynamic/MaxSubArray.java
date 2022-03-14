package dynamic;

import org.w3c.dom.ls.LSOutput;

public class MaxSubArray {
    public static int maxSubArray(int[] arr) {

        int currentMax = arr[0];
        int allMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentMax = Math.max(arr[i], currentMax + arr[i]);
            allMax = Math.max(currentMax, allMax);
        }
        return allMax;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 8, 2, 4, -9};
        System.out.println(maxSubArray(arr));
    }
}

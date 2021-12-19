package arrays;

import java.util.Arrays;

public class FlipAndInvertImage {
    public  static int[][] flipAndInvertImage(int[][] image ) {
        for (int i = 0; i < image.length; i++) {
            reverseArray(image[i]);
            invertBinaryArray(image[i]);
        }
        return image;
    }

    private static void invertBinaryArray(int[] arr) {
        for (int i =0; i < arr.length; i++){
            arr[i] ^=1;
        }
    }

    private static void reverseArray(int[] arr) {
           for (int i = 0, j = arr.length-1; i < j; ++i, --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] image = { {1,1,0}, {1,0,1}, {0,0,0} };
        System.out.print(Arrays.deepToString(flipAndInvertImage(image)));
    }
}

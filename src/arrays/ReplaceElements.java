package arrays;

import java.util.Arrays;

public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        int max = -1;
        int currNum = 0;
        for (int i = arr.length-1; i >=0; i--) {
            currNum = arr[i];
            arr[i] = max;
            max = Math.max(currNum, max);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.print(Arrays.toString(replaceElements(arr)));
    }
}

package CW;

import java.util.Arrays;

public class WrapPresent {
    public static int wrapPresent(int h, int w, int l) {
        int[] arr = {h,w,l};
        Arrays.sort(arr);
        return 4* arr[0] + 2 * (arr[1] + arr[2]) +20;
    }

    public static void main(String[] args) {
        System.out.println(wrapPresent(13,13,13));
        System.out.println(wrapPresent(17,32, 11));
    }
}

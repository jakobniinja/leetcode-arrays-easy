package arrays;

import java.util.Arrays;

public class SquareSorted {
    public  static int[] squareSorted(int[]arr) {
       int[] squareArr = new int[arr.length];
    int i = arr.length - 1;
    
    int start = 0; 
    int end = arr.length - 1;
    
    while(start <= end) {
        if (arr[start] * arr[start] > arr[end] * arr[end]) {
            squareArr[i--] = arr[start] * arr[start];
            start++;
        } else {
            squareArr[i--] = arr[end] * arr[end];
            end--;
        }
    }
    
    return squareArr;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2, -1, 3, 5};
        System.out.println(Arrays.toString(squareSorted(nums)));
    }
}

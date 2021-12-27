package arrays;

import java.util.Arrays;

public class SumZeroElements {
    public static int[] sumZeroElements(int n) {
                int nums[] = new int[n];
        int j = 0;
        //Case 1 : n is even
        if(n%2==0) {
            for (int i = -n / 2; i <= n / 2; i++) {
                if (i == 0) {
                    continue;
                }
                nums[j] = i;
                j++;
            }
        }
        //Case : n is odd
        else {
            for (int i = -n / 2; i <= n / 2; i++) {
                nums[j] = i;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(sumZeroElements(6)));
    }
}

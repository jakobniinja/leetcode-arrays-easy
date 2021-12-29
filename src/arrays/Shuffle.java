package arrays;

import java.util.Arrays;

public class Shuffle {
    public static int[]  shuffle(int[] nums, int n ) {
        int x[] = new int[2*n];
        int j = 0;
        for( int i =0; i < n; i++){
            x [j++] =nums[i];
            x[j++] = nums[i+n];
        }
        return x;
     }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        System.out.print(Arrays.toString(shuffle(nums, 4)));
    }
}

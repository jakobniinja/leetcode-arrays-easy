package arrays;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] height    ) {
        int[] expected = height.clone();
        int res = 0;
        Arrays.sort(expected    );

        for (int i = 0; i < expected.length; i++) {
            if(expected[i] != height[i])res ++;
        }
        return res;
}


    public static void main(String[] args) {
        int[] heights  = {1,1,3,2,1,3};
        System.out.println(heightChecker(heights));
    }
}

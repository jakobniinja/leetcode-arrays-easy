package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static int[]  findEvenNumbers(int[] digits) {
          int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

		// Since we want to find 3-Digit, we iterate from 100 to 999
        List<Integer> res = new ArrayList<>();
        for (int i = 100; i <= 999; i++) {
            if (i % 2 == 0) { // Check whether i is even
                int j = i;

                // Record the frequency for each digit of i
                int[] tmp = new int[10];
                while (i > 0) {
                    int d = i % 10;
                    tmp[d]++;
                    i /= 10;
                }

                // Check whether i is valid
                boolean has = true;
                for (int d = 0; d < 10; d++) {
                    if (tmp[d] > count[d]) {
                        has = false;
                        break;
                    }
                }
                if (has) res.add(j);
                i = j;
            }
        }

		// convert the list to an array
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,7,5};
        System.out.println(Arrays.toString(findEvenNumbers(nums)));
    }
}

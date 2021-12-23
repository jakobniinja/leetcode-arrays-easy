package arrays;

import java.util.ArrayList;
import java.util.List;

public class PrefixedDivBy5 {
    public static List<Boolean> prefixedDivBy5( int[] nums ) {
        int cur = 0;
        List<Boolean> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            cur = ( 2 * cur + nums[i]) % 5;
            if (cur == 0  )  res.add(true);
            else res.add(false);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.print(prefixedDivBy5(nums));
    }
}

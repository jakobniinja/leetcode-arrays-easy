package arrays;

import java.util.HashMap;

public class LongestHormonius {

    public static int longestHormonius(int[]nums ) {

        int res = 0;
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int x : nums) {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }
        for (int i : h.keySet()) {
            if (h.containsKey(i + 1)) {
                res = Math.max(res, (h.get(i) + h.get(i + 1)));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]nums =  {1,3,2,2,5,2,3,7};
        System.out.print(longestHormonius(nums));
    }
}

package arrays;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandy {
    public static int distributeCandy(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(candyType.length / 2, set.size());
    }

    public static void main(String[] args) {
        int[] candytypes = {1, 1, 2, 2, 3, 3, 5};
        System.out.print(distributeCandy(candytypes));
    }
}

package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {
    public static int lastStoneWeight( int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int x : stones) list.add(x);
        while (list.size() > 1) {
            Collections.sort(list, Collections.reverseOrder());
            int a = list.get(0);
            int b = list.get(1);

            list.remove(0);
            list.remove(0);

            if (a != b) list.add(a - b);
        }
        if (list.size() == 0) return 0;
        return list.get(0);
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.print(lastStoneWeight(stones));
    }
}

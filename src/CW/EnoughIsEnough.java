package CW;

import java.util.*;

public class EnoughIsEnough {
    public static int[] enoughIsEnough(int[] el, int n) {

        if(n < 1)
            return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>(el.length);

        for (int e : el) {
            if(map.get(e) == null || map.get(e) < n){
                list.add(e);
            }

            map.merge(e, 1, Integer::sum);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(enoughIsEnough(new int[]{20, 37, 20, 21}, 1)));
    }
}

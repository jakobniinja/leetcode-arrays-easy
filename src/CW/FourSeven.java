package CW;

import java.util.Map;

public class FourSeven {
    public static int fourSeven(int n) {
        while (n != 7 && n != 4)
            return 0;
        return 11 - n;
    }

    public static int fourSeven2(int n) {
        Map<Integer, Integer> result = Map.of(4, 7, 7, 4);
        return result.getOrDefault(n, 0);
    }

    public static void main(String[] args) {
        System.out.println(fourSeven2(4));
        System.out.println(fourSeven2(7));

    }


}

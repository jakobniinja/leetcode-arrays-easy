package CW;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DontGiveMe5 {
    public static int dontGiveMe5(int start, int end) {
        int res = 0;
        for (int i = start; i <= end; i++) {
            if (String.valueOf(i).indexOf('5') == -1) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMe5(1, 9));

    }
}

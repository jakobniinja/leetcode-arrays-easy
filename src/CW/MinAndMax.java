package CW;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinAndMax {
    public static int min(int[] list) {
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(list[i] < min) min = list[i];

        }

        return min;
    }

    public static int max(int[] list) {
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(list[i] > max) max = list[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] list = new int[]{124, 85, 22, -43};
        System.out.println(max(list));
        System.out.println(min(list));
    }
}

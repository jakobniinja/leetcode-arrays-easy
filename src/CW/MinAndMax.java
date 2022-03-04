package CW;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinAndMax {
    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] list = new int[]{124, 85, 22, -43};
        System.out.println(max(list));
        System.out.println(min(list));
    }
}

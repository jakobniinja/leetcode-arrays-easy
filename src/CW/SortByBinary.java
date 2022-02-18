package CW;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortByBinary {
    public static Integer[] sortByBinary(Integer list[]) {

        return Arrays.stream(list)
                .sorted(Comparator.comparing(Integer::bitCount, Comparator.reverseOrder())
                        .thenComparing(Integer::highestOneBit)
                        .thenComparing(Integer::compare))
                .toArray(Integer[]::new);
    }

    public static int count1(String s) {
        return (int) Stream.of(s).filter(x -> x.contains("1")).count();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBinary(new Integer[]{1,15,5,7,3})));
    }


}
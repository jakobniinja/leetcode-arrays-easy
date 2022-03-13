package CW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoMissingNums {
    static List<Integer> findMissing(List<Integer> xs) {
        for (int i = Collections.min(xs); ; i++)
            if (!xs.contains(i))
                return List.of(i, i + 1);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(8,10, 7,9, 13 );
        System.out.println( findMissing(list));
    }
}

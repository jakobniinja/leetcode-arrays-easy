package arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TruncateSentence {
    public static String truncateSentence(String s, int k ) {
        return Arrays.stream(s.split(" "))
                .limit(k)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("What is the solution to this problem", 4 ));
    }
}

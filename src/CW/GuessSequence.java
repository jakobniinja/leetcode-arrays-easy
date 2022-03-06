package CW;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GuessSequence {
    public static int[] guessSequence(int num ) {
        return IntStream.rangeClosed(1,num).mapToObj(Integer::toString).sorted().mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(guessSequence(16)));
    }
}

package CW;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GuessSequence {
    public static int[] guessSequence(int num ) {


        List<String> list = List.of("jakob", "är", "den bästa");

//        list.stream().collect(Collectors.maxBy())
        return IntStream.rangeClosed(1,num).mapToObj(Integer::toString).sorted().mapToInt(Integer::parseInt).toArray();

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(guessSequence(16)));
    }
}

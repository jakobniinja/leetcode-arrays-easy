package CW;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static String removeDuplicate(String s) {
        return Stream.of(s.split(" ")).distinct().collect(Collectors.joining( ", "));
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));

    }
}

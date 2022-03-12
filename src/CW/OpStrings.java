package CW;

import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class OpStrings {


    public static String vertMirror (String s) {
        return Arrays.stream(s.split("\n")).map( st -> new StringBuilder(st).reverse().toString()).collect(Collectors.joining("\n"));
    }
    public static String horMirror (String s) {
        return new StringBuilder(vertMirror(s)).reverse().toString();

    }
    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}

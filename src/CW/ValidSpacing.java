package CW;

import java.util.stream.Stream;

public class ValidSpacing {
    public static boolean validSpacing(String s ) {
        return s.trim().replace(" ", "").equals(s);
    }

    public static void main(String[] args) {
        System.out.println(validSpacing("Hello world"));
    }
}

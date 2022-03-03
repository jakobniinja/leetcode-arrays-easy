package CW;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleChar {
    public static String  doubleChar(String s) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(doubleChar("hello world"));
    }
}

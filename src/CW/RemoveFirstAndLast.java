package CW;

import java.util.stream.Stream;

public class RemoveFirstAndLast {
    public static String removeFirstAndLast(String str) {
        return str.substring(1, str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(removeFirstAndLast("person"));
    }
        public static String remove(String str) {

       return str.replaceAll("^.|.$", "");

    }
}

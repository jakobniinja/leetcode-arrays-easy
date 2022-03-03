package CW;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GreetingName {
    public static String greetingName(String name) {
        return String.format("Hello, %s how are you doing?", name);
    }

    public static void main(String[] args) {
        System.out.println(greetingName("jakob"));
    }
}

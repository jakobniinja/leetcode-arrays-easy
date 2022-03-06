package CW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortTextbook {
    public static List<String> sort(List<String> textbooks) {
        //use sort() from Collections with the static field of String class to ensure case insensitivity
       textbooks.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
       return textbooks;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("jakob");
        list.add("david");
        list.add("per");
        list.add("ramme");
        System.out.println(sort(list));
    }
}

package CW;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSheep {
    public static String  countSheep(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(String.format("%d sheep...", i));
        }
        return sb.toString();
    }

    public static String countSheep2(int n){
         return IntStream.rangeClosed(1, n).mapToObj(i -> i + " sheep...")
                 .collect(Collectors.joining());

    }



    public static void main(String[] args) {
        System.out.println(countSheep2(5));
        System.out.println(countSheep2(100));
    }
}

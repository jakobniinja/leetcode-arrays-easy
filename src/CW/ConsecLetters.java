package CW;

import java.util.Arrays;

public class ConsecLetters {
    public static boolean consecLetters(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(int i = 0; i< arr.length -1; i++){
            if(arr[i] - arr[i+1] != 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(consecLetters("dabc"));
        System.out.println(consecLetters("abbc"));
        System.out.println(consecLetters("v"));
    }
}

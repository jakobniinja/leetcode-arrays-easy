package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public static String[] keyboardRow(String[] words) {
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        String thirdRow = "zxcvbnmZXCVBNM";

        ArrayList<String> result = new ArrayList<>();


        for (String word : words) {
            if (isPartOfRow(word, firstRow)) {
                result.add(word);
            } else if (isPartOfRow(word, secondRow)) {
                result.add(word);
            } else if (isPartOfRow(word, thirdRow)) {
                result.add(word);
            }
        }


        String[] resultArr = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }


    public static boolean isPartOfRow(String word, String row) {
        for (int i = 0; i < word.length(); i++) {
            if (!row.contains(String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

            String[] word = {"Alaska", "Dad"};
        System.out.print(Arrays.toString(keyboardRow(word)));
    }
}

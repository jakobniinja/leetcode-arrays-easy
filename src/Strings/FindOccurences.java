package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOccurences {
    public static String[] findOccurences(String text, String first, String second) {

        String[] s = text.split(" ");
        List<String> list = new ArrayList<>();
        for(int i =0; i< s.length -2; i++){
            if(s[i].equals(first) && s[i+1].equals(second) ){
                list.add(s[i+2]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String text = "we will we will rock you", first ="we", second = "will";
        System.out.println(Arrays.toString(findOccurences(text, first, second)));
    }
}

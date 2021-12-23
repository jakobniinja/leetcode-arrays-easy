package arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {
    public static List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();

        if(words == null||words.length==0)return res;

        int[] arr1 = new int[26];

        for(char c: words[0].toCharArray()){
            arr1[c-'a']++;
        }

        for (int i = 0; i < words.length; i++) {
            int[] arr2 = new int[26];
            String w = words[i];
            for(char c : w.toCharArray()){
                arr2[c-'a'] = Math.min(arr2[c-'a'] + 1, arr1[c-'a']);
            }
            arr1=  arr2;
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < arr1[i]; j++) {
                res.add((char)('a'+i) + "");
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] words = {"cool","lock","cook"};
        System.out.println(commonChars(words));
    }
}

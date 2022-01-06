package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static int  countWords(String[] words1, String[] words2) {

        Map<String, Integer> map = new HashMap<>();

        for(String word: words1){
            map.put(word, map.getOrDefault(word,0) +1);
        }

        int count = 0;

        for(String word: words2){
            Integer freq = map.get(word);

            if(freq != null && freq <= 1){
                if(freq==1)++count ;
                else if(freq==0) --count;
                map.put(word, freq-1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words1 = {"a","ab"};
        String[] words2 = {"a","a","a","ab"};
        System.out.println(countWords(words1, words2));
    }
}

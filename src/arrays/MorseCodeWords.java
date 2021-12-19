package arrays;

import java.util.HashSet;
import java.util.Set;

public class MorseCodeWords {
    public static int morseCodeWords( String[] words) {
       String[]  map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            int j = 0;
            String word = words[i];
            StringBuilder sb  = new StringBuilder();
            while ( j< word.length()){
                String sg = map[word.charAt(j) -'a'];
                sb.append(sg);
                j++;
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.print(morseCodeWords(words));
    }
}

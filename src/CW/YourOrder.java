package CW;

import org.apache.commons.lang3.CharSequenceUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class YourOrder {
    public static  String yourOrder(String words) {
        List<Character> numbers = new ArrayList<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));

        StringTokenizer st = new StringTokenizer(words);
        String[] sWords =new String[st.countTokens()];

        while(st.hasMoreTokens()){
            String cWord = st.nextToken();
            for(int i=0; i< cWord.length(); i++){
                if(numbers.contains(cWord.charAt(i))) {
                    sWords[numbers.indexOf(cWord.charAt(i))] = cWord;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : sWords)
            sb.append(s + " ");

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(yourOrder("is2 Thi1s T4est 3a"));
    }
}

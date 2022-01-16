package Strings;

import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {
    public static boolean checkIfPangram(String s ) {
        Set set = new HashSet();

        for(char c : s.toCharArray()){
            set.add(c);
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(checkIfPangram(s));
    }
}

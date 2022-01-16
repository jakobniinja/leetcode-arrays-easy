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

    public static boolean checkIfPangramII(String s ) {
       for(char c = 'a'; c <= 'z'; c++){
           if(!s.contains(c+""))
               return false;
       }
       return true;
    }


    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangramII(s));
    }
}

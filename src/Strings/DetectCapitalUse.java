package Strings;

public class DetectCapitalUse {
    public static boolean detectCapitalUse(String word) {
       if(allCapitals(word) || allLower(word)  || onlyFirstCapital(word)){
           return true;
       }return false;
    }

    private static boolean onlyFirstCapital(String word) {
        char ch = word.charAt(0);
        if(Character.isUpperCase(ch) && allLower(word.substring(1)))
            return true;
        return false;
    }

    private static boolean allLower(String word) {
        int count =0;
        for( int i =0; i< word.length(); i++){
            char ch = word.charAt(i);
           if(Character.isUpperCase(ch)){
               count ++;
           }
        }
        if(word.length() == count)
            return true;
        return false;
    }

    private static boolean allCapitals(String word) {
        int count =0;
        for( int i =0; i< word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                count ++;
            }
        }
        if(word.length() == count ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "FlaG";

        System.out.println(detectCapitalUse(word));

    }
}

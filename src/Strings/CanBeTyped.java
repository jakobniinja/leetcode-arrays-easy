package Strings;

public class CanBeTyped {
    public static int canBeTyped(String text, String brokenLetters) {
        String words[] = text.split(" ");

       if(brokenLetters.length() == 0){
           return words.length;
        }

       int count =0;

       for( int i =0; i< words.length; i++) {
           for(int j =0; j<brokenLetters.length(); j++){
               if(words[i].indexOf(brokenLetters.charAt(j)) != -1)
                   break;
              if(j == brokenLetters.length() -1)
                  count ++;
           }
       }
       return count;
     }

    public static void main(String[] args) {
    String text = "heldlo worlda", brokenLetters="ad";
        System.out.println(canBeTyped(text, brokenLetters));
    }
}

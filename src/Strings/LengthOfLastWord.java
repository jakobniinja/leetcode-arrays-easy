package Strings;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s ) {

        s = s.trim();
        int wordCount = 0;
        for(int i = s.length()-1;  i>=0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            wordCount++;
        }
        return wordCount;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}

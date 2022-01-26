package Strings;

public class ReversePrefix {
    public static String reversePrefix(String word, char ch) {
        int firstOcc = word.indexOf(ch);
        StringBuilder str = new StringBuilder();

        for (int i = firstOcc; i >-1; i--) {
            str.append(word.charAt(i));
        }
        for(int i =firstOcc +1; i< word.length(); i++){
            str.append(word.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        System.out.println(reversePrefix(word, 'd'));
    }
}

package Strings;

public class MergeAlternately {
    public static String mergeAlternately(String word1 ,String word2) {
        StringBuilder sb = new StringBuilder();
        int length =0;
        if(word1.length() > word2.length()){
            length =word1.length();
        }else{
            length= word2.length();
        }

        for(int i =0; i< length; i++){
            if(i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab", word2 ="pqrs";
        System.out.println(mergeAlternately(word1 ,word2));
    }
}

package Strings;

public class CanConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] alp_counter = new int[26];
        for(char c : magazine.toCharArray())
            alp_counter[c-'a']++;
        for(char c : ransomNote.toCharArray()){
            if(alp_counter[c-'a'] ==0) return false;
            alp_counter[c-'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}

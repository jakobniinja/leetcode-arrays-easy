package arrays;

public class  IsAlienSorted {
      private int[] char_map = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i < 26; i ++) {
            char_map[order.charAt(i) - 'a'] = i;
        }

        for(int i = 1; i < words.length; i ++) {
            if (compare(words[i - 1], words[i]) > 0)
                return false;
        }
        return true;
    }

    private int compare(String word1, String word2) {
        int i = 0;
        int j = 0;
        int diff = 0;
        while (i < word1.length() && j < word2.length() && diff == 0) {
            diff = char_map[word1.charAt(i) - 'a'] - char_map[word2.charAt(i) - 'a'];
            i++;
            j++;
        }
        if(diff == 0 ) {
            return word1.length() - word2.length();
        }
        else {
            return diff;
        }
    }


    public static void main(String[] args) {
        IsAlienSorted a = new IsAlienSorted();
        String[] words = {"hello","leetcode"};
        System.out.print(a.isAlienSorted(words, "hlabcdefgijkmnopqrstuvwxyz"));
    }

}

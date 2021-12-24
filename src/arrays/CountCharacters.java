package arrays;

public class CountCharacters {
    public  static int  countCharacters( String[] words, String chars ) {

        int map[] = new int[26], res = 0;
        for ( char c : chars.toCharArray()) map [c-'a']++;
        for (String word: words){
            int[] map2 = map.clone();
            boolean flag = true;
            for(char ch: word.toCharArray()){
                if(map2[ch-'a'] == 0){
                    flag = false;
                    break;
                }else map2[ch-'a']--;
            }
            if(flag) res+= word.length();
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words ={"cat","bt","hat","tree"};
        String chars= "atach";
        System.out.println(countCharacters(words, chars));
    }
}

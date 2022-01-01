package arrays;

public class AnyStringEquals {
    public static boolean anyStringEquals(String[] word1, String[] word2) {
                    int count =0;
        for(int i = 0; i< word1.length-1; i++){
            if(word1[i].equals(word2[i])) count ++;
        }
        return count== word1.length;
    }


    public static void main(String[] args) {
        String[] word1 ={"abc", "d", "defg"};
        String[] word2 ={"abcddefg"};
        System.out.println(anyStringEquals(word1, word2));
    }
}

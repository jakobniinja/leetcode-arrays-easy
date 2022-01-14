package Strings;

public class MaxRepeat {
    public static int maxRepeat(String s, String word) {
        StringBuilder sb = new StringBuilder(word);
        int k =0;
        while(s.indexOf(sb.toString()) != -1){
            k++;
            sb.append(word);
        }
        return  k;
    }

    public static void main(String[] args) {
        String s = "ababc", w ="ab";
        System.out.println(maxRepeat(s ,w));
    }
}

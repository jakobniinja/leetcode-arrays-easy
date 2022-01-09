package Strings;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int L =0, R = s.length()-1;

        while(L< R){
            while (L<R && !vowels.contains(arr[L] +""))
                L++;
            while(L < R && !vowels.contains(arr[R]+ ""))
                R--;
            char temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}

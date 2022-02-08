package CW;

public class SuffRef {
    public static int suffRef(String s ) {
        int n = s.length();

        for (int i = n/2; i >0 ; i--) {
            if(s.substring(0, i).equals(s.substring(n-i))){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(suffRef("aaa"));
        System.out.println(suffRef("acbacc"));
        System.out.println(suffRef("abcabc"));
        System.out.println(suffRef("abcd"));
    }
}

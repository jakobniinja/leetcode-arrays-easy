package arrays;

public class MinOp {
    public static int minOp(String s) {
        return Math.min(helper(s, '0'), helper(s,'1'));

    }

    private static int helper(String s, char ch) {
       int c =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                c++;
            }
            ch=flip(ch);

        }
        return c;
    }

    private static char flip(char ch) {
        return ch=='0' ? '1': '0';
    }

    public static void main(String[] args) {
        String s ="10";
        System.out.println(minOp(s));
    }
}

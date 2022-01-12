package Strings;

public class StringReverseWord {
    public static String stringReverseWord(String s ) {

        int L =0, r=0, len =s.length();
        char[] ch = s.toCharArray();

        for(int i =0; i<=len; i++){
            if(  i==len || ch[i] ==' ' ){
                L=r;
                r=i;
                reverse(ch,L, r-1);
                r++;
            }
        }
        return new String(ch);
    }
        private static void reverse(char[] s, int L, int r){
        char c;
        while(r>L) {
            c = s[L];
            s[L++] = s[r];
            s[r--] = c;
        }
    }

    public static void main(String[] args) {
        String s = "God Ding";
        System.out.println(stringReverseWord(s));
    }
}

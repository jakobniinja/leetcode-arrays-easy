package Strings;

public class IsSubSequence {
    public static boolean  isSubSequence (String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t2 = t.toCharArray();
        int j  =0;

        for( int i =0; i< t2.length; i++){
            if( j< s1.length){
                if(t2[i] == s1[j]){
                    j++;
                }
            }
        }
        if(j >= s1.length) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubSequence(s, t));
    }
}

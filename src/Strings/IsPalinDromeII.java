package Strings;

public class IsPalinDromeII {
    public static boolean isPalinDromeII(String s) {
        if(s==null) return false;

        return check(s, 0, s.length()-1, false );
    }

    private static boolean check(String s, int L, int R, boolean skip) {
        while(R>L){
            if(s.charAt(L) == s.charAt(R)){
                L++; R--;
            }else {
                if(!skip){
                    return check(s,L+1, R,true) || check(s, L, R-1, true);
                }else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bajja";
        System.out.println(isPalinDromeII(s));
    }

}

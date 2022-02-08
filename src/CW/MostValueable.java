package CW;

public class MostValueable {
    public static char mostValueable(String s) {
        char ret = '?';
        int hi = 0;
        for(char c = 'z'; c>= 'a'; c--){
            int a = s.indexOf(c), b=s.lastIndexOf(c);
            if(a>= 0 && (b-a ) >= hi) {
                hi = (b-a); ret = c;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
//        System.out.println(mostValueable( "dcbadcba"));
//        System.out.println(mostValueable("aabccc"));
//        System.out.println(mostValueable("efgefg"));
        System.out.println(mostValueable("efghijefghi"));
    }
}

package Strings;

public class MinMoves {
    public static int  minMoves(String s) {
        int moves = 0;
        int i =0;
        while ( i< s.length()) {
            if (s.charAt(i) == 'X') {
                i += 3;
                moves++;
            } else {
                i++;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        String s ="XXX";
        System.out.println(minMoves(s));
        System.out.println(minMoves("XXOX"));
    }
}

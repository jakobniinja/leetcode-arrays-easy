package CW;

public class SpeedLetters {
    public static String speedLetters(final String s) {
        var sb = new StringBuilder(" ".repeat(132));
        int i =0;

        for(char c : s.toCharArray())
            sb.setCharAt(i++ + c -'A',c );
        return (""+sb).stripTrailing();
    }

    public static void main(String[] args) {
        System.out.println(speedLetters("AZ"));
        System.out.println(speedLetters("ABC"));
        System.out.println(speedLetters("ACE"));
        System.out.println(speedLetters("HELLOWORLD"));
    }
}

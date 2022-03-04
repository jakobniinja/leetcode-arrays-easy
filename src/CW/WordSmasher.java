package CW;

public class WordSmasher {
    public  static String smash(String... words){
        StringBuilder sb = new StringBuilder(words.length);
        for (int i = 0; i < words.length; i++) {
            String tw = words[i].trim();
            sb.append(tw);
            if(i< words.length){
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static String smash2(String... words){
        return String.join( " ", words);
    }
    public static void main(String[] args) {
        String[] ws = new String[]{"Bilal", "Djaghout"};
        System.out.println(smash2(ws));
    }
}

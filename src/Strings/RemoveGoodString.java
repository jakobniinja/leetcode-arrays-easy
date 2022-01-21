package Strings;

public class RemoveGoodString {
    public static String removeGoodString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < sb.length(); i++) {
            if (Math.abs((int) sb.charAt(i) - (int) sb.charAt(i - 1)) == 32) {
                sb.deleteCharAt(i - 1);
                sb.deleteCharAt(i - 1);
                i = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(removeGoodString(s));
    }

}


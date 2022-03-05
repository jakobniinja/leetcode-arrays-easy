package CW;

public class CountSheep {
    public static String  countSheep(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(String.format("%d sheep...", i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countSheep(5));
    }
}

package CW;

public class MulitTable {
    public static String multiTable(int num) {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.format("%d * %d = %d", i + 1, num, (i+1) * num);
        }
        return String.join("\n", arr);
    }

    public static void main(String[] args) {
        System.out.println(multiTable(5));
        System.out.println( "1 * 5 = 5\n2 * 5 = 10\n3 * 5 = 15\n4 * 5 = 20\n5 * 5 = 25\n6 * 5 = 30\n7 * 5 = 35\n8 * 5 = 40\n9 * 5 = 45\n10 * 5 = 50");
    }

}

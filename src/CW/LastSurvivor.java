package CW;

public class LastSurvivor {
    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder sb = new StringBuilder(letters);

        for (int i : coords)
            sb.deleteCharAt(i);
        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(lastSurvivor("abc", new int[]{1,1}));
        System.out.println(lastSurvivor("kbc", new int[]{0,1}));
        System.out.println(lastSurvivor("zbk", new int[]{2,1}));
    }
}

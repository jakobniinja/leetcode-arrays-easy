package CW;

public class Feast {
    public static boolean feast(String beast, String dish) {
        String lowerB = beast.toLowerCase();
        String lowerD = dish.toLowerCase();

        char firstCh = beast.charAt(0);
        char lastCh = beast.charAt(beast.length() -1);

        char firstChD =dish.charAt(0);
        char lastChD =dish.charAt(dish.length() -1);

        return firstCh == firstChD && lastCh == lastChD;
    }
}

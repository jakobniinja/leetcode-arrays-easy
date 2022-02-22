package CW;

import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class StockList {
    public static String stockSummary(String[] stock, String[] categories) {


        if (stock.length == 0 || categories.length == 0) return "";


        final Map<String, Integer> counts = stream(stock)
                .collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.summingInt(StockList::stockCount)));
        return stream(categories)
                .map(s -> "(" + s + " : " + counts.getOrDefault(s, 0) + ")")
                .collect(Collectors.joining(" - "));


    }

    private static int stockCount(final String s) {
        return Integer.valueOf(s.split(" ")[1]);
    }

    public static void main(String[] args) {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[]{"A", "B"};
        System.out.println(StockList.stockSummary(art, cd));

    }
}

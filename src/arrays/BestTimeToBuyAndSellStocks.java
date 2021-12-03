package arrays;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks {
    public static int bestTimeToBuyAndSellStocks(int[] prices) {
               int min = prices[0];
        int max = 0;

        for ( int i = 0; i < prices.length; i++) {

            min = Math.min(min, prices[i]);
            int profit = prices[i] - min;
            max = Math.max(profit, max);

        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,9};
        System.out.println(bestTimeToBuyAndSellStocks(nums));
    }
}

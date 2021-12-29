package arrays;

import java.util.Arrays;

public class FinalPrices {
    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
               if(prices[j]<= prices[i]){
                   prices[i] = prices[i] -  prices[j];
                   break;
               }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.print(Arrays.toString(finalPrices(prices)));
    }
}

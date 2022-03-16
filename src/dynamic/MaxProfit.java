package dynamic;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int maxProfit =0,
                minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            maxProfit  = Math.max(maxProfit, prices[i] -minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] list = {7,1,5,3,6,4};
        System.out.println(maxProfit(list));
    }
}

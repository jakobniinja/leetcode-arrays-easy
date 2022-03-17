package dynamic;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];

        for (int i = 2; i < dp.length; i++) {
            int oneStep = dp[i-1] + cost[i-1];
            int twoStep = dp[i-2] + cost[i-2];

            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        int[] prices = new int[]{10,15,20};
        System.out.println(minCostClimbingStairs(prices));

    }
}

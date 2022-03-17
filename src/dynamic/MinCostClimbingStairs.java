package dynamic;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

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


    private  static final Map<Integer, Integer> memo = new HashMap<>();

    public static int minCostClimbStairs2(int[] cost){
        return minCost(cost.length, cost);
    }

    private static int minCost(int i, int[] cost){
        if(i <= 1) return 0;

        if (memo.containsKey(i))return memo.get(i);

        int oneStep = cost[i-1] + minCost(i-1, cost);
        int twoStep = cost[i-2] + minCost(i-2, cost);
        memo.put(i, Math.min(oneStep, twoStep));
        return memo.get(i);
    }
    public static void main(String[] args) {
        int[] prices = new int[]{10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,
                20,10,15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,
                15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,
                10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,
                20,10,15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,
                15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,
                10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,
                20,10,15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,
                15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,
                10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,
                20,10,15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,
                15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,
                10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,
                20,10,15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,
                15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,
                10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,
                20,10,15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,
                15,20, 10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20,10,15,20


        };

        for (int i = 0; i < 100; i++) {
            System.out.println(minCostClimbingStairs(prices));

        }

    }
}

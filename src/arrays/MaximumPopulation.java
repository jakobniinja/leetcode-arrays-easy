package arrays;

public class MaximumPopulation {
    public static int  maximumPopulation(int[][] logs) {
        final int startYr = 1950;
        int[] pops = new int[101];
        for (int i = 0; i < logs.length; i++) {
            pops[logs[i][0] - startYr]++;
            pops[logs[i][1] - startYr]--;
        }
        int maxPop = pops[0], res = startYr;
        for (int i = 1; i < pops.length; i++) {
            pops[i] += pops[i - 1];
            if (pops[i] > maxPop) {
                res = i + startYr;
                maxPop = pops[i];
            }
        }
        return res;
    }
}

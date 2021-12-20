package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlicesCandy = 0;
        int sumBobsCandy = 0;

        Set bobsCandies = new HashSet<>();
        for(int i : aliceSizes) sumAlicesCandy += i;
        for(int i : bobSizes){
            sumBobsCandy += i;
            bobsCandies.add(i);
        }
        for(int aliceCandy : aliceSizes){
            int sum =  (sumBobsCandy - sumAlicesCandy)/2 + aliceCandy;
            if(bobsCandies.contains(sum))
                return new int[]{aliceCandy, sum};
        }

        return null;
    }


    public static void main(String[] args) {
        int[] alicesSize = {2};
        int[] bobSize = {1,3};
        System.out.print(Arrays.toString(fairCandySwap(alicesSize, bobSize)));
    }
}

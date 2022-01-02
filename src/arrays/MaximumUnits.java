package arrays;

import java.util.Arrays;

public class MaximumUnits {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] -a[1]);

        int units =0;
        for( int[] type : boxTypes){
            if(type[0]<= truckSize   ){
                units += type[0]* type[1];
                truckSize -= type[0];
            }else{
                units += truckSize * type[1];
                return units;
            }
        }
        return units;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{5,10}, {2,5}, {4,7}, {3,9}};
        System.out.println(maximumUnits(boxTypes, 10));
    }
}

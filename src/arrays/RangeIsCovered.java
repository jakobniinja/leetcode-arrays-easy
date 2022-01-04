package arrays;

import java.util.HashSet;
import java.util.Set;

public class RangeIsCovered {
    public static boolean rangeIsCovered(int[][] range, int left, int right) {
        Set<Integer> hs = new HashSet<>();

        for( int i =0; i< range.length; i++){
            for( int j =range[i][0]; j<=range[i][range[0].length-1]; j++){
                hs.add(j);
            }
        }
        for(int i =left; i <=right; i++){
            if(!hs.contains(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] range ={{1,10}, {10,20}};
        System.out.println(rangeIsCovered(range, 21, 21));
    }
}

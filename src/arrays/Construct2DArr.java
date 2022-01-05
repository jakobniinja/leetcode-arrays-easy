package arrays;

import java.util.Arrays;

public class Construct2DArr {

    public static int[][] construct2DArr(int[] original, int m, int n) {
        if(original.length != m * n) return new int[0][0];

        int [][] p = new int[m][n];
        int a  =0;

        for( int i =0; i< m; i++){
            for(int j = 0; j < n; j++   ){
                p[i][j] = original[a];
                a++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        System.out.println(Arrays.deepToString(construct2DArr(original, 2, 2)));
    }
}

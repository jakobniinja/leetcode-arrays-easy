package arrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] arr = new int [matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arr[i][j] = matrix[j][i];
            }
        }
       return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,4}, {2,4,1} , {4,2,1} };
        System.out.print(Arrays.deepToString(transposeMatrix(matrix)));
    }
}

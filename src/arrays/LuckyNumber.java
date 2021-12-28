package arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static List<Integer> luckyNumber(int[][] matrix) {

        ArrayList<Integer> minInRow = new ArrayList<>();
        ArrayList<Integer> maxInCol = new ArrayList<>();

        for (int row = 0; row< matrix.length; row++) {
            int min = Integer.MAX_VALUE;
            int col = 0;

            while(col < matrix[row].length){
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
                col++;
            }
           minInRow.add(min);
        }

        for (int col = 0; col < matrix[0].length; col++) {
            int max = Integer.MIN_VALUE;
            int row =0;

            while (row < matrix.length){
                if(matrix[row][col] > max){
                    max = matrix[row][col];
                }
                row++;
            }
           maxInCol.add(max);
        }
        List<Integer> common = new ArrayList<>(minInRow);
        common.retainAll(maxInCol);
        return common;
    }

    public static void main(String[] args) {
        int[][] matrix ={{1,10,4,2}, {9,3,8,7}, {15, 16,17,12}};
        System.out.print(luckyNumber(matrix));
    }
}

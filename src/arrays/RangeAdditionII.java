package arrays;

public class RangeAdditionII {
    public static int  rangeAdditionII(int m, int n, int[][] ops ) {
        int minRow = m;
        int minColumn = n;

        for (int i = 0; i < ops.length; i++) {
            minRow=Math.min(minRow, ops[i][0]);
            minColumn= Math.min(minColumn, ops[0][i]);
        }
        return minRow * minColumn;
    }


    public static void main(String[] args) {
        int[][] matrix = { {1,2}, {3,3}};
        System.out.print(rangeAdditionII(3, 3 , matrix));
    }
}

package arrays;

public class OddCells {

    public static int oddCells(int m , int n, int[][] indices) {
        int[] rows= new int [m], cols= new int [n];

        int oddCount =0;

        for (int i = 0; i < indices.length; i++) {
            rows[indices[i][0]]++;
            cols[indices[i][1]]++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                oddCount += (rows[i] + cols[j]) % 2;
            }
        }
        return oddCount;
    }


    public static void main(String[] args) {
        int[][] indices = {{0,1}, {1,1}};
        System.out.print(oddCells(2,3, indices));
    }
}

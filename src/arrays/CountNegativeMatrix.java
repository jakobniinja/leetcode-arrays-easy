package arrays;

public class CountNegativeMatrix {
    public static int countNegativeMatrix(int[] [] matrix) {

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if(matrix[i][j] < 0 ) count ++;
            }
        }
        return count ;
    }

    public static int  countNegativeMatrix2(int[][] grid) {
                if (grid == null || grid.length == 0) return 0;
        int res = 0;
        for (int[] g : grid) {
            int l = 0, r = g.length - 1;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (g[mid] >= 0) l = mid + 1; //be careful even it's 0, it should move to right part
                else r = mid;
            }
            res += g[l] >= 0 ? g.length - l - 1 : g.length - l; //it's possibe all of them are pos, so check the stopped value
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,2}, {1,0}, {-1}};
        System.out.println(countNegativeMatrix2(matrix));
    }
}

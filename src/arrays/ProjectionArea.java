package arrays;

public class ProjectionArea {
    public  static int projectionArea(int[][] grid ) {
        int i, j, max1, max2, N = grid.length;

        int area = 0;

        for (i = 0; i < N; i++) {
           max1 =grid[i][0];
           max2=grid[0][i];
            for (j = 0; j < N; j++) {
                max1 = Math.max(grid[i][j], max1);
                max2 = Math.max(grid[j][i], max2);

                if(grid[i][j] != 0){
                    ++area;
                }
            }
            area += ( max1 + max2);
        }
        return area;
    }

    public static void main(String[] args) {
        int[][] grid = { {0,2}, {1,0} };
        System.out.print(projectionArea(grid));

    }
}

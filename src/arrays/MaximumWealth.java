package arrays;

public class MaximumWealth {
    public static int maximumWealth(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for( int i =0; i < grid.length; i++){
            int ans = 0;

            for(int j = 0; j < grid[0].length; j++){
                ans += grid[i][j];
            }
            max = Math.max(ans, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] grid ={{2,8,7}, {7,1,3}, {1,9,5}};
        System.out.println(maximumWealth(grid));
    }
}

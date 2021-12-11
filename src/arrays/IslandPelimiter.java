package arrays;

public class IslandPelimiter {
    public  static  int  islanPelimiter(int[][] grid) {
        int y = grid.length;
        int x = grid[0].length;
        int result = 0;


        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if(grid[i][j] == 1){
                    result +=4;
                    if(j +1 < x && grid[i][j+1] ==1) result -=2;
                    if(i+1 < y && grid[i+1][j] == 1 ) result -=2;
                }
            }
        }
    return result ;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.print(islanPelimiter(grid));
    }

}

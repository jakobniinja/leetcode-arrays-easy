package arrays;

public class CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length ==2) return true;

        int xslope = coordinates[1][0] - coordinates[0][0];
        int yslope = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int dx = coordinates[i][0] - coordinates[0][0];
           int dy = coordinates[i][1] - coordinates[0][1];

           if(xslope * (dy) != yslope * (dx) ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1,2}, {2,3}, {3,4}};
        System.out.print(checkStraightLine(coordinates));
    }

}

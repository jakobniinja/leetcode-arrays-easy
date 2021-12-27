package arrays;

public class TimeToVisitAllPoints {
    public static int  timeToVisitAllPoints(int[][] points) {
        int t = 0;
        for (int i = 1; i < points.length; i++) {
            int yd = Math.abs(points[i][1] - points[i-1][1]);
            int xd = Math.abs(points[i][0] - points[i-1][0]);

            int dia = Math.min(xd,yd);
            t = t+ dia + yd - dia + xd -dia;
        }
        return t;
    }

    public static void main(String[] args) {
        int[][] points = {{1,1}, {3,4} };
        System.out.print(timeToVisitAllPoints(points));
    }
}

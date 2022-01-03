package arrays;

public class NearestValidPoint {
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int shortestIndex = -1;
        int shortestDistance = Integer.MAX_VALUE;
        for( int i =0; i< points.length; i++){
            if(points[i][0] ==x || points[i][1] == y){
                int dis = Math.abs(x - points[i][0] + Math.abs(y - points[i][1]));
                if(dis < shortestDistance){
                    shortestDistance = dis;
                    shortestIndex = i;
                }
            }
        }
        return shortestIndex;
    }

    public static void main(String[] args) {
        int[][] points ={{2,3}};
        System.out.println(nearestValidPoint(3,4, points));
    }
}

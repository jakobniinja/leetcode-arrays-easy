package CW;

import java.util.Arrays;

public class RobinsonCrusoe {
    public static double[] robinsonCrusoe(int n, double d, int ang,  double distmult, double angmult) {
        double x = 0.0, y = 0.0, a = ang* Math.PI / 180.0;
        for(int i =1; i<= n; i++){
            x += d * Math.cos(a);
            y += d * Math.sin(a);
            d *= distmult;
            a *= angmult;

        }
        return new double[] {x, y};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(robinsonCrusoe(14, 0.22, 20, 1.02, 1.14)));
    }

}

package CW;

public class MapVector {
    public static double[]  mapVector(double[] vector, double[] circle1, double[] circle2) {
        double xRatio = (vector[0] + circle1[2] - circle1[0]) / (2 * circle1[2]);
        double yRatio = (vector[1] + circle1[2] - circle1[1] ) / (2 * circle1[2]);
        return new double[]{
                circle2[0] - circle2[2] + 2*  circle2[2] * xRatio,
                circle2[1] - circle2[2] + 2 * circle2[2] * yRatio
        };
    }

    public static void main(String[] args) {
//        System.out.println(mapVector(new double[] { }));
    }
}

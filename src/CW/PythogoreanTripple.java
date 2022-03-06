package CW;

public class PythogoreanTripple {
    public  static int  pythogoreanTripple(int[] tripple) {
        int a = tripple[0], b = tripple[1], c =tripple[2];
        double leftSide =  Math.pow(c, 2);
        double rightSide = Math.pow(b, 2) + Math.pow(a,2);

        return leftSide == rightSide ? 1 : 0;
     }

    public static void main(String[] args) {
        int[] p1={3,4,5};
        int[] p2={3,5,7};
        System.out.println(pythogoreanTripple(p1));
        System.out.println(pythogoreanTripple(p2));

    }
}

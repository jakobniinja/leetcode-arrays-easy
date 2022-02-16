package CW;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Benefactor {
    public static double benefactor(double[] arr, double nAvg) {
        double sum = Arrays.stream(arr).sum();
        double res = nAvg * (arr.length +1 ) - sum;

        if(res>0) return Math.round(Math.ceil(res));
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(benefactor(new double[]{14, 30, 5, 7 ,9 ,11, 15}, 30));
    }
}


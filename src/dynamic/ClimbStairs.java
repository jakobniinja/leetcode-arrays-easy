package dynamic;

import org.apache.commons.math3.ode.FirstOrderIntegrator;

public class ClimbStairs {
    public static int climbStairs(int n) {
        if(n == 1) return 1;
        if(n ==2) return 2;

        int a = 1, b =2;

        for (int i = 3; i <= n; i++) {
            int tmp = a+b;
            a = b;
            b = tmp;
        }
        return b;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}

package CW;

import java.util.stream.IntStream;

public class HalfSum {
    public static int halfSum(int n) {

        int sum =0;
        while(n !=1){
            sum +=n;
            n/=2;
        }

        return sum+1;
    }
    public static int halfSum2(int n){
        return IntStream.iterate(n, x -> x !=0, x -> x/2).sum();
    }

    public static void main(String[] args) {
        System.out.println(halfSum2(25));
    }
}

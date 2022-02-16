package CW;

public class FibonacciFunc {
    public static long fibonacciFunc  (long n ) {

        if(n < -1) return -1;
        long num1 = 0, num2 = 1;

        for (long i = 0; i <n-1 ; i++) {
            long temp = num1 + num2;
            num1= num2;
            num2= temp;
        }

        return num2;

    }

    public static void main(String[] args) {
        System.out.println(fibonacciFunc(15L));
    }
}

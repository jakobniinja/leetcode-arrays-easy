package dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fib {

    private static Map<Integer, Long> memo = new HashMap<>();
    public static long fib(int n) {
        if( 0 == n || 1 == n ) return n;

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        long res = fib(n - 1) + fib(n - 2);
         memo.put(n,  res);
         return res;
    }

    public static void main(String[] args) {
        System.out.println(fib(50));
    }
}

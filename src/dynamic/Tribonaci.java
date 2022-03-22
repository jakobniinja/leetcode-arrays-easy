package dynamic;

import java.util.HashMap;

public class Tribonaci {
    public static int tribonaci(int n) {
        if (n<= 0) return 0;
        int n0 =0, n1 = 1, n2=1;
        for (int i = 3; i <= n; i++) {
            int tmp = n2;
            n2 = n0 + n1 +n2;
            n0 = n1;
            n1 = tmp;
        }
        return n2;
    }


    public static int tribonaci2(int n){
        if(n<= 0){
            return 0;
        }else if(n ==1 | n== 2){
            return 1;
        }else{
            return tribonaci(n-3) + tribonaci(n-2) + tribonaci(n-1);
        }
    }
    public static int fibonaci(int n){
        if(n ==0) return 0;
        if(n ==1 || n ==0) return 1;
        return fibonaci(n-2) + fibonaci(n-1);
    }






















    private static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int fib( int n){
        int n1 = 0, n2=1;

        if(memo.containsKey(n)){
            return memo.get(n);
        }
        for (int i = 2; i <= n; i++) {
            int tmp = n1 + n2;
            n1 =n2;
            n2 = tmp;
        }
        memo.put(n, n2);
        return n2;
    }







    public static void main(String[] args) {
        System.out.println(fib(39));
    }
}

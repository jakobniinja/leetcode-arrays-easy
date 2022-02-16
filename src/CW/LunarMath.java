package CW;

public class LunarMath {
    public static long lunarMath(long n1, long n2) {

        long t = 0, c =1;

        while (n1 != 0 ||  n2!= 0){
            t += Math.max(n1%10, n2%10) * c ;
            n1/=10; n2/=10; c*=10;
        }

        return t;

    }

    public static void main(String[] args) {
        System.out.println(lunarMath(124, 7));
    }

}
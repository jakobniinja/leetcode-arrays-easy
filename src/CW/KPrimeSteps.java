package CW;

public class KPrimeSteps {
    public static int  kPrimeSteps(long n) {
        if (n==0) return 0;

        int count =0;
        for (; n % 2 ==0; count++, n/=2){}
        for (int i = 3; i * i <=n; i+=2)
            for (; n % i ==0; count++, n/=i){}
        if(n > 1)
            count ++;
        return count;
        }

    public static void main(String[] args) {
//        System.out.println(kPrimeSteps());
    }

}

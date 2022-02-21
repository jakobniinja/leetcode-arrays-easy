package CW;

public class IsPrime {
    public static boolean isPrime(int num) {
        if(num < 2){
            return false;
        }else {
            int nSquarted = (int) Math.sqrt(num) + 1;
            for (int i = 2; i < nSquarted; i++) {
                if(num % i== 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(73));
        System.out.println(isPrime(83));
        System.out.println(isPrime(1));
        System.out.println(isPrime(7));
    }
}

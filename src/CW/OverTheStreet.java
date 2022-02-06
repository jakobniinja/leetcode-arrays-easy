package CW;

public class OverTheStreet {
    public static long  overTheStreet(long address, long n) {
        if(address %2 ==0){
            long x = (n *2 ) - address;
            return  1+x;
        }else {
            long x = (n * 2 ) -address;
            return x+1;
        }
    }
}

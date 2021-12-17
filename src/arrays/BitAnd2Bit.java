package arrays;

public class BitAnd2Bit {
    public static boolean bitAnd2Bit(int[] bits) {
       int i = 0;

       while( i < bits.length -1 ){
           i = (bits[i] ==1) ? i +2 : i+1;
       }
       return i == bits.length-1;
    }

    public static void main(String[] args) {
        int[] bits ={1,0,0};
        System.out.println(bitAnd2Bit(bits));
        int[] bits2 = {1,1,1,0};
        System.out.println(bitAnd2Bit(bits2));
    }

}

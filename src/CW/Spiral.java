package CW;


import java.math.BigInteger;

public class Spiral {
    public static BigInteger spiral(BigInteger size) {
       return size.pow(2).divide(BigInteger.TWO).add(size).subtract((size.mod(BigInteger.TWO).equals(BigInteger.ZERO)) ? BigInteger.ONE : BigInteger.ZERO);
    }
}

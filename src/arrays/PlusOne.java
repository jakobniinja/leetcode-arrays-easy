package arrays;

import java.util.Arrays;

public class PlusOne {
    public  static int[]  plusOne(int[] digits) {
        boolean carry = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
                carry = true;
            }
        }
        if (carry) {
            digits[0] = 1;
            return Arrays.copyOf(digits, digits.length  +1);
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,9};
        int[] x = plusOne(nums);
        System.out.println( Arrays.toString(x
        ));
    }
}

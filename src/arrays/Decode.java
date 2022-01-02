package arrays;

import java.util.Arrays;

public class Decode {
    public static int[] decode(int[] encoded, int first ) {
        int[] arr = new int[encoded.length +1];
        arr[0] = first;

        for( int index =1; index < arr.length; ++index){
            arr[index] = encoded[index - 1]^ arr[index-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        System.out.println(Arrays.toString(decode(encoded, 4)));
    }
}

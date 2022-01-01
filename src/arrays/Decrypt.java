package arrays;

import java.util.Arrays;

public class Decrypt {
    public static int[] decrypt(int[] code, int k) {
       int[] res = new int[code.length];

       for( int i=0; i< code.length; i++){
          for(int j =k; j!=0; j+=k >0 ?-1:1){
              res[i] += code[(i+j + code.length) % code.length];
          }
       }
       return res;
    }

    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        System.out.println(Arrays.toString(decrypt(code, -2)));
    }
}

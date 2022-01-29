package CW;

import java.util.Arrays;

public class GravityFlip {
    public static int[] gravityFlip(char dir,int[] arr) {
       if(dir == 'R'){
           Arrays.sort(arr);
           return arr;
       }
       else {
           int count = 0;
           int[] arr1 = new int[arr.length];
           if(dir == 'L'){
               Arrays.sort(arr);
               for(int i = arr.length -1; i>= 0; i--){
                   arr1[count++] = arr[i];
               }
           }
           return arr1;
       }
    }
}

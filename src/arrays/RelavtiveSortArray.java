package arrays;

import java.util.Arrays;

public class RelavtiveSortArray {
    public static int[]  relavtiveSortArray( int[] arr1,int[] arr2 ) {


        int[] alc = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            alc[arr1[i]]++;
        }

        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < alc[arr2[i]]; j++) {
               arr1[k++] = arr2[i];
            }
            alc[arr2[i]] =0;
        }
        for (int i = 0; i < alc.length; i++) {
            for (int j = 0; j < alc[i]; j++) {
                arr1[k++]= i;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        System.out.print( Arrays.toString( relavtiveSortArray(arr1, arr2)));

    }

}

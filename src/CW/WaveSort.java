package CW;

import java.util.Arrays;

public class WaveSort {
    public static void waveSort(int[] arr) {

        Arrays.sort(arr);

        for(int i  =0; i< arr.length-1; i+=2){
            swap(arr, i , i+1);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }

}

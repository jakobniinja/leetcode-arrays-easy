package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

            void bubbleSort(int arr[])
        {
                    if(arr.length ==0) return;

            int n = arr.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }
    void print (int arr[]){
        int n = arr.length;
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(arr[i]);
        }
    }


    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] ={64, 34, 25,12, 22, 11,90};
        ob.bubbleSort(arr);
        System.out.println("sorted" );
        ob.print(arr);
    }
}

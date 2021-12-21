package arrays;

public class ValidMountain {
    public static boolean isValidMountain(int[] arr) {
                int i = 0;
        int n  = arr.length -1;


        while ( i< n && arr[i] < arr[i+1]) i++;

        if(i == 0 || i==n ) return false;

        while (i < n && arr[i] > arr[i+1]) i++;

        return i ==n;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        System.out.print(isValidMountain(arr));
    }
}

package arrays;

public class PeekIndexInMountainArray {
    public static int  peekIndexInMountainArray( int[] arr ) {
        int s = 0;
        int e = arr.length-1;

        int mid = s + (e-s) /2;
        while( s < e){
            if(arr[mid] < arr[mid+1]){
                s = mid +1;
            }else {
                e = mid;
            }
                    mid = s+ (e-s)/2;
        }
        return s ;
    }

    public static void main(String[] args) {
        int[] arr = {0,2, 3, 1,0};
        System.out.println(peekIndexInMountainArray(arr));
    }

}

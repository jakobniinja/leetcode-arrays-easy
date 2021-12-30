package arrays;

public class ContainsPattern {
    public static boolean containsPattern(int[] arr, int m, int k) {
        int count = 0;

        for( int i = 0; i +m < arr.length; i++  ){
            if(arr[i] != arr[i+m]) count =0;
            else count ++;

            if( count == (k-1) * m) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,4};
        System.out.println(containsPattern(arr, 1,2));
    }
}

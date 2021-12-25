package arrays;

public class ThreeConsecutiveOdds {
    public static boolean  threeConsecutiveOdds(int[] arr) {


        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] %2 == 1 && arr[i+1] %2 ==1 && arr[i+2] %2 ==1 ) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.print(threeConsecutiveOdds(arr));
    }

}

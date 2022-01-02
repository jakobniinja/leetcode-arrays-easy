package arrays;

public class LargestAltitude {
    public static int largestAltitude(int[] gain) {
        int max =0, sum = 0;
        for( int i : gain){
            sum += i;
            if( sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gains = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gains));
    }
}

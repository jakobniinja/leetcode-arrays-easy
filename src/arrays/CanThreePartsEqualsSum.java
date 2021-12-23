package arrays;

public class CanThreePartsEqualsSum {
    public  static boolean canThreePartsEqualsSum( int[] arr ) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        if(sum%3 != 0) return false;
        int partSum = sum/3;

        sum = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            if(partSum==sum) {
                sum =0;
                count ++;
            }
        }

        if(count >= 3) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,-6,6,7,9,-1,2,0,1};
        System.out.println(canThreePartsEqualsSum(nums));
    }
}

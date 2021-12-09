package arrays;


import java.util.Arrays;

public class KthLargestElement {
    public  static int  kthLargestElement( int[] nums, int k ) {
        Arrays.sort(nums);
       int n = nums.length -1 ;
        return nums[n-k] ;
    }


    public static void main(String[] args) {
       int[] nums = {3,2,1,5,6,4};
        System.out.print(kthLargestElement(nums, 2));
    }
}

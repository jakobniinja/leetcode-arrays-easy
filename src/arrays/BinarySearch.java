package arrays;

public class BinarySearch {
    public static int binarySearch( int [] nums, int target) {
        int res = helper(nums, target, 0, nums.length);
        return res ;
    }

    private static int helper(int[] nums, int target, int lo, int hi) {
       if(lo == hi){
           return -1;
       }

       int mid = (lo + hi)/2;

       if(nums[mid] > target){
           return helper(nums,target, lo, mid);
       } else if (nums[mid] < target) {
           return helper(nums,target, mid +1, hi);
       }
       return mid;
    }


    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.print(binarySearch(nums, 9) );
    }
}

package arrays;

public class KthMissingPosNum {
    public static int kthMissingPosNum(int[] arr, int k ) {
        int lo = 0;
        int hi = arr.length -1;
        while(lo <= hi){
            int mid = lo + (hi -lo)/2;
            int missingCount =arr[mid] -1 -mid;
            if(missingCount <k ){
                lo = mid +1;
            }else{
                hi = mid -1;
            }
        }
        if( hi< 0) return k;
        int count = arr[hi] -1-hi;
        return arr[hi]+k-count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.print(kthMissingPosNum(nums, 2));
    }
}

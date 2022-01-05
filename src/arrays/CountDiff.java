package arrays;

public class CountDiff {
    public static int countDiff(int[] nums , int k) {
        int count = 0;
        int n = nums.length;
        int arr[] = new int[201];

        for(int i =0; i < n; i++){
            arr[nums[i]]++;
        }
        for( int i=k+1; i< 201; i++){
            count += arr[i]*arr[i-k];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums ={3,2,1,5,4};
        System.out.println(countDiff(nums, 2));
    }
}

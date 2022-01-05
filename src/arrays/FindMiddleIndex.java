package arrays;

public class FindMiddleIndex {
    public static int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        for( int i =0, ls = 0; i<= nums.length -1; ls += nums[i++]){
            if(ls * 2 == sum -nums[i])return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
}

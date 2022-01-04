package arrays;

public class SubesetOfXorSum {
    public static int subesetOfXorSum(int[] nums) {
       return rec(nums, 0,0);
    }

    private static int rec(int[] nums, int i, int xor) {
        if(i == nums.length){
            return xor;
        }
        return rec(nums, i+1, xor) + rec(nums, i+1, xor ^nums[i]);
    }

    public static void main(String[] args) {
            int[] nums ={5,1,6};
        System.out.println(subesetOfXorSum(nums));
    }
}

/*
package arrays;

public class RangeSum {
    int [] arr;
    public void RangeSum(int[] nums) {
        arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            if (i == 0) arr[i] = nums[i];
            else arr[i] = arr[i - 1] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if(left == 0)return arr[right];
        return arr[right] - arr[left-1];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSum sum = new RangeSum(nums);

        sum.sumRange(0,2);
        sum.sumRange(2,5);

    }
}
*/

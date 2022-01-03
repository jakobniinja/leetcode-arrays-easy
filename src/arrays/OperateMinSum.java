package arrays;

public class OperateMinSum {

    public static int  operateMinSum(int[] nums ) {
        int count  =0;
        for( int i =1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                count +=  nums[i-1] - nums[i] +1;
                nums[i] = nums[i-1] +1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums ={1,1,1};
        System.out.println(operateMinSum(nums));
    }
}

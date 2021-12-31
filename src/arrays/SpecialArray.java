package arrays;

public class SpecialArray {
    public static int specialArray(int[] nums) {
        int high = 0;
        for( int i =0; i< nums.length; i++){
            if(high < nums[i]) high = nums[i];
        }

        for( int i =0; i<= high; i++){
            int count = 0;
            for( int j =0; j< nums.length; j++){
                if(i <= nums[j]) count ++;
            }
            if(count ==i) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }
}

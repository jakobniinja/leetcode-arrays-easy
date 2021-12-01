package arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }


    public static void main(String[] args) {
        int[] nums   = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}

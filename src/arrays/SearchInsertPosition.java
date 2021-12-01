package arrays;

public class SearchInsertPosition {
    public static int SearchInsertPosition(int[] nums, int target) {
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == target) {
                return i;
            }
        }


        int j = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] > target) {
                return i;
            }
            j++;
        }
        return j;

    }


    public static void main(String[] args) {
        int [] nums = new int[]{1,3,5,6};
        System.out.println(SearchInsertPosition(nums, 3));
    }
}

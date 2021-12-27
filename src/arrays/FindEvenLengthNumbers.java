package arrays;

public class FindEvenLengthNumbers {

    public static int  findEvenLengthNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            int length = String.valueOf(nums[i]).length();
            if(length%2 ==0) count ++;
        }
       return count ;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.print(findEvenLengthNumbers(nums));
    }
}

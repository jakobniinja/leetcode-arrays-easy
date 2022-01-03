package arrays;

public class ArraySign {
    public static int arraySign(int[] nums ) {
        int sign = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[i] < 0) sign ++;
            if(nums[i] == 0) return 0;
        }
        if(sign %2 ==1) return -1;
        return 1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,-1,1,-1};
        System.out.println(arraySign(nums));
    }
}

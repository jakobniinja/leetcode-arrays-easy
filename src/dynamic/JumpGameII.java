package dynamic;

public class JumpGameII {
    public static int jumpGame2(int[] nums) {
        int end=0, maxPosition=0, steps =0;


        for (int i = 0; i < nums.length -1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);


            if(i == end){
                end = maxPosition;
                steps++;
            }
        }
        return steps;

    }

    public static void main(String[] args) {

        int[] nums = new int[] {2,3,1,1, 4};
        System.out.println(jumpGame2(nums));
    }
}

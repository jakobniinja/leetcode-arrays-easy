package arrays;

public class GetMinDistance {
    public static int getMinDistance(int[] nums, int target, int start ) {
        int minDist = Integer.MAX_VALUE;
        for( int i =0; i< nums.length; i++){
            if(nums[i] == target){
                if(Math.abs(i-start) < minDist) minDist = Math.abs(i-start);
            }
        }
        return minDist;
    }

    public static void main(String[] args) {
        int[] nums ={1,1,1,1,1,1,1,1,1,1};
        System.out.println(getMinDistance(nums, 1,0));
    }
}

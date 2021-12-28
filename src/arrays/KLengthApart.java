package arrays;

public class KLengthApart {
    public static boolean kLengthApart(int[] nums, int k ) {
        int prev = -k -1;
        int idx = 0;

        for(int x : nums) {
            if( x == 1){
                if (idx - prev <k +1) return false;
                prev = idx;
            }
            idx++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,0,1};
        System.out.println(kLengthApart(nums,2 ));
    }
}


package arrays;

import java.util.*;

public class IntersectionArray {
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> set = new ArrayList<>();


        for(int i: nums1){
            set.add(i);
        }

       List<Integer> inter = new ArrayList<>();
        for (int i : nums2){
            if(set.contains(i)){
                inter.add(i);
            }
        }


        int index = 0;
        int[] result = new int[inter.size()];

        for (int i : inter){
            result[index++ ] = i;
        }
      return result;
    }

    public static void main(String[] args) {
    int[] nums1 = {8,4, 4 , 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.print(Arrays.toString(intersectionArray(nums1, nums2)));
    }
}

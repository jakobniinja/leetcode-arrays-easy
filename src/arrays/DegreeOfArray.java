package arrays;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {
    public static int degreeOfArray(int[] nums) {
        Map<Integer, Integer> occ = new HashMap<>();
        int maxOcc = 0;


        Map<Integer, Integer>  firstSeen= new HashMap<>();
        int minDist = 0;

        for (int i = 0; i < nums.length; i++) {
            occ.put(nums[i], occ.getOrDefault(nums[i], 0)+1);
            firstSeen.putIfAbsent(nums[i], i);

            int count = occ.get(nums[i]);
            if(count > maxOcc){
                maxOcc = count;
                minDist = i -firstSeen.get(nums[i]) +1;
            } else if (count == maxOcc){
                minDist = Math.min(minDist, i - firstSeen.get(nums[i]) +1);
            }
        }
        return minDist;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4,2};
        System.out.print(degreeOfArray(nums));

    }
}

package arrays;

import java.util.*;

public class MissingInArray {

    public static  List<Integer> missingInArray(int[] nums) {
            ArrayList<Integer> missingNumbers = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>()    ;


            for (int i : nums){
                set.add(i);
            }


        for (int i = 1; i < nums.length; i++) {
           if(!set.contains(i)){
                missingNumbers.add(i);
           }
        }

        return missingNumbers;
    }


    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.print(missingInArray(nums));
    }
}

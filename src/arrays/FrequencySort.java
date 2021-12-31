package arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static int[] frequencySort(int[] nums ) {
        Map<Integer, Integer> m = new LinkedHashMap<>();

        for(int num : nums) {
            m.put(num, m.getOrDefault(num, 0) +1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> m.get(a) ==m.get(b) ? (b-a) : m.get(a) - m.get(b) );
        for(int num : nums){
            pq.add(num);
        }
       for(int i =0; i< nums.length; i++){
           nums[i] = pq.poll();
       }
       return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
}

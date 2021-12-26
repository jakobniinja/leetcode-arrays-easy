package arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueAccurences {
    public static boolean uniqueAccurences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {
            int freq = freqMap.getOrDefault(arr[i], 0) +1;
            freqMap.put(arr[i], freq);
        }

        Map<Integer, Integer> reverseMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet() ){
            int key = entry.getKey();
            int freq = entry.getValue();
            if(reverseMap.containsKey(freq)){
                return false;
            }
            reverseMap.put(freq, key);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueAccurences(arr));

    }

}

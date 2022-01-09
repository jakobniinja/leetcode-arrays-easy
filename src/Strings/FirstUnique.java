package Strings;

import java.util.HashMap;

public class FirstUnique {
    public static int firstUnique(String s ) {
        char[] arr = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        int L = arr.length;

        for(int i = 0; i< L; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }

        for(int i =0; i< L; i++){
            if(map.get(arr[i]) ==1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUnique(s));
    }
}

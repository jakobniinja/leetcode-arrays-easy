package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoOutOfThree {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3 ) {

        Map <Integer,Integer> map1 = new HashMap <Integer,Integer>();

    Map <Integer,Integer> map2 = new HashMap <Integer,Integer>();

    Map <Integer,Integer> map3 = new HashMap <Integer,Integer>();

    for(int i = 0 ; i < nums1.length; i++ ) {
        map1.put(nums1[i], 1);
    }

    for(int i = 0 ; i < nums2.length; i++ ) {
        map2.put(nums2[i], 1);
    }

    for(int i = 0 ; i < nums3.length; i++ ) {
        map3.put(nums3[i], 1);
    }

    List <Integer> arli = new ArrayList<Integer> ();

    for(int i = 0; i < nums2.length; i++) {
        if (map1.containsKey(nums2[i]) || map3.containsKey(nums2[i])) {
            if (!arli.contains(nums2[i])) {
                arli.add(nums2[i]);
            }
        }
    }

     for(int i = 0; i < nums3.length; i++) {
         if (map1.containsKey(nums3[i]) || map2.containsKey(nums3[i])) {
             if (!arli.contains(nums3[i])) {
                 arli.add(nums3[i]);
             }
         }
     }

    return arli;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2};
        int[] arr2 = {4,3,3};
        int[] arr3 = {5};

        System.out.println(twoOutOfThree(arr1, arr2, arr3));
    }
}

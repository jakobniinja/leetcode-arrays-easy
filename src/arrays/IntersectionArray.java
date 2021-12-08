package arrays;

import java.util.*;

public class IntersectionArray {
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i: nums1) {
            set.add(i);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }
        int[] res = new int[intersection.size()];
        int idx = 0;
        for (int i : intersection) {
            res[idx++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.print(Arrays.toString(intersectionArray(nums1, nums2)));
    }
}

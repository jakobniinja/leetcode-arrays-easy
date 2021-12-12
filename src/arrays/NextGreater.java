package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreater {
    public static int[] nextGreater(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i : nums2){
            while(!stack.isEmpty() &&  stack.peek() < i ){
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }

    public static void main(String[] args) {
    int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4 };
        System.out.print(Arrays.toString(nextGreater(nums1, nums2 ) ));
    }
}

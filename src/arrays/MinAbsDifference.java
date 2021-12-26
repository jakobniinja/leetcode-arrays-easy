package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDifference {
    public static List<List<Integer>> minAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (var i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        var diffs = new ArrayList<List<Integer>>();

        for (var i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min)
                diffs.add(List.of(arr[i - 1], arr[i]));
        }
        return diffs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 10, 15};
        System.out.println(minAbsDifference(arr));
    }
}

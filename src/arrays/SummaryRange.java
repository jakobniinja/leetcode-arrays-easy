package arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static List<String> summaryRange(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int start = nums[i];

            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if (start != nums[i]) list.add("" + start + "->" + nums[i]);
            else list.add("" + nums[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7};
        System.out.print(summaryRange(nums));
    }
}

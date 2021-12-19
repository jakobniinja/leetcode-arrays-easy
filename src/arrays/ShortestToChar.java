package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestToChar {
    public static int[]   shortestToChar  ( String s, char c) {
        Queue<Integer> q = new LinkedList<>();
        int ans[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                ans[i] = 0;
                q.add(i);
            } else {
                ans[i] = -1;
            }
        }
        while (!q.isEmpty()) {
            int i = q.poll();
            if (i + 1 < ans.length && ans[i + 1] == -1) {
                ans[i + 1] = ans[i] + 1;
                q.add(i + 1);
            }
            if (i - 1 >= 0 && ans[i - 1] == -1) {
                ans[i - 1] = ans[i] + 1;
                q.add(i - 1);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
            String s = "loveleetcode";
        System.out.print(Arrays.toString(shortestToChar(s, 'e')));
    }
}

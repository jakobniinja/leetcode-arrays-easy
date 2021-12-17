package arrays;

import java.util.Arrays;

public  class FloodFill {
}
class Solution {
    int color;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        color = image[sr][sc];
        helper(image, sr, sc, newColor);
        return image;
    }
    private void helper(int[][] image, int sr, int sc, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color || image[sr][sc] == newColor) return;
        image[sr][sc] = newColor;
        helper(image, sr + 1, sc, newColor);
        helper(image, sr - 1, sc, newColor);
        helper(image, sr, sc + 1, newColor);
        helper(image, sr, sc - 1, newColor);
    }

    public static void main(String[] args) {
        int[][] image = {{0,0,0}, {0,0,0}};
        Solution f =  new Solution();
        System.out.print(Arrays.deepToString(f.floodFill(image, 0, 0, 2)));
    }
}
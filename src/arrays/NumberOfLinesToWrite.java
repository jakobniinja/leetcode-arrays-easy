package arrays;

import java.util.Arrays;

public class NumberOfLinesToWrite {
    public static int[] numberOfLinesToWrite(int[] widths, String s ) {
       int[] result = new int [2];
       int num_lines = 1;
       int width =0;

       for (char c : s.toCharArray()){
           int char_width = widths[c- 'a'];
           if(char_width + width > 100){
               num_lines++;
               width= 0;
           }
           width += char_width;
       }
       result[0] = num_lines;
       result[1] = width;
       return result;
    }

    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(numberOfLinesToWrite(widths, s)));
    }
}
nt
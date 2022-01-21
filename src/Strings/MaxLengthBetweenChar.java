package Strings;

import java.util.Arrays;

public class MaxLengthBetweenChar {
    public static int maxLengthBetweenChar(String s) {
        int[] distanceArr = new int[26];

        Arrays.fill(distanceArr, -1);
        int maxDis = -1;
       for(int i =0; i< s.length(); i++){
           if(distanceArr[s.charAt(i) -'a']==-1){
               distanceArr[s.charAt(i) -'a'] =i;
           }else {
               maxDis =Math.max(maxDis, i -distanceArr[s.charAt(i)-'a'] -1);
           }
       }

        return maxDis;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(maxLengthBetweenChar(s));
    }
}

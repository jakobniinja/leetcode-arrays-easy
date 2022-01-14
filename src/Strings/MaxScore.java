package Strings;

public class MaxScore {
    public static int maxScore(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        if(chars[0] =='0') max =1;

        for(int i =1; i< chars.length; i++){
            if(chars[i] =='1')max++;
        }
        int curr = max;

        for(int i =1; i< chars.length-1; i++){
        if(chars[i] =='0') curr++;
        else curr--;
        max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        String s ="011101";
        System.out.println(maxScore(s));
    }
}

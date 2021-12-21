package arrays;

import java.util.Arrays;

public class DiStringMatch {
    public  static int[] diStringMatch( String s ) {
        int[] res=new int[s.length()+1];
        int n=s.length();
        int count=0,i;
        for(i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'D') res[i] = n--;
            else res[i] = count++;
        }
        res[i]=n;
        return res;
    }

    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }
}

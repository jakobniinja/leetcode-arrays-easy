package arrays;

public class BalancedString {
    public static int balancedString(String s) {

        int l =0, r =0, count =0;

        for(int i =0; i< s.length(); i++){
            char x = s.charAt(i);
            if(x=='L' ) l++;
            if(x=='R') r++;

            if (l == r) {

                count ++;
                l =0;
                r=0;
            }
        }
        return count;

    }
}

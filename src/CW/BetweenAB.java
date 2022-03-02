package CW;

;import java.util.ArrayList;
import java.util.Arrays;

public class BetweenAB {
    public static int[] betweenAB(int a, int b) {

        int[] res = new int[b-a+1];

        for(int i =a; i<= b; i++){
            res[i-a] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(betweenAB(1, 4)));
        System.out.println(Arrays.toString(betweenAB(-2, 2)));
    }

}

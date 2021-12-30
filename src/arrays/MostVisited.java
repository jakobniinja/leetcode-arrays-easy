package arrays;

import java.util.ArrayList;
import java.util.List;

public class MostVisited {
    public static List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> res = new ArrayList<>();
        int start = rounds[0];
        int end = rounds[rounds.length -1];
        int[] ans = new int[n+1];

        while(start !=end){
            ans[start]++;
            start ++;
            if(start > n) start =1;
        }
        ans[end]++;
        for( int i =1; i<=n; i++){
            if(ans[i] != 0) res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
       int[] rounds = {1,3,1,2};
        System.out.print((mostVisited(4, rounds)));
    }
}

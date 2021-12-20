package arrays;

import java.util.HashMap;

public class HasGroupSizeX {
    public static boolean hasGroupSizeX( int[] deck ) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i : deck){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int min = map.get(deck[0]);
        for (int i: map.keySet()){
            min= hcf(min, map.get(i));
        }
        if(min < 2) return false;
        return true;
    }

    private static int hcf(int a, int b) {
        if(a < b) return hcf(b,a);
        if(a%b == 0) return b;
        return hcf(b, (a%b));
    }

    public static void main(String[] args) {
        int[] deck = {1,2,2,4,4};
        System.out.print(hasGroupSizeX(deck));
    }
}

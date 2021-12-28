package arrays;

import java.util.ArrayList;
import java.util.List;

public class BuildArray {
    public static List<String> buildArray(int[] target, int n) {
        int m = 0;
        String pop = "Pop";
        String push = "Push";
        List<String> list = new ArrayList<>();

        for( int i =1; i <= n; i++){
            if(m == target.length) break;
            if(target[m] == i){
                list.add(push);
                m++;
            }else{
                list.add(push);
                list.add(pop);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] target = {1,2,2, 4 };
        System.out.println(buildArray(target, 2));
    }
}

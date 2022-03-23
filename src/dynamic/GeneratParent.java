package dynamic;

import java.util.ArrayList;
import java.util.List;

public class GeneratParent {
    public static List<String> generatParent(int n) {
        List<String> list = new ArrayList<>();
        parentGenerator(list, "",n, n );
        return list;
    }

    private static void parentGenerator(List<String> list, String curr, int left, int right) {
        if(left == 0 && right ==0){
            list.add(curr);
        }
        if(left > 0 ){
            parentGenerator(list, curr + "(" , left-1, right );
        }
        if(right > left){
            parentGenerator(list, curr+ ")" , left, right-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generatParent(4));
    }
}

package dynamic;


import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> pascalsTriangle(int n) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (n == 0) return triangle;

        List<Integer> fRow = new ArrayList<>();
        fRow.add(1);
        triangle.add(fRow);

        for (int i = 1; i < n; i++) {
            List<Integer> pRow = triangle.get(i-1);
            List<Integer> cRow = new ArrayList<>();
            cRow.add(1);


            for (int j = 1; j < i; j++) {
                cRow.add(pRow.get(j-1) + pRow.get(j));
            }
            cRow.add(1);
            triangle.add(cRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(pascalsTriangle(5));
    }
}

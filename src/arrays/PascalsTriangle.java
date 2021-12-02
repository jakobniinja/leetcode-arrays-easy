package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
    public  List<List<Integer>> pascalsTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0 ) return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);


        for (int i = 1; i < numRows; i++) {
            List<Integer> previous = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();

           row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previous.get(j-1) + previous.get(j));

            }
            row.add(1);
            triangle.add(row);
        }
return triangle;
    }
}

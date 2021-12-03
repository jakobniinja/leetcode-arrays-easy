package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalstTiangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        if (rowIndex == 0) return result;

        List<Integer> prev = getRow(rowIndex - 1);
        for (int i = 0; i < prev.size() - 1; i++) {
            result.add(prev.get(i) + prev.get(i + 1));
        }
        result.add(1);

        return result;
    }


    public static void main(String[] args) {
        System.out.println(getRow(3));

    }
}

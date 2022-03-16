package dynamic;

import io.reactivex.internal.d.e.I;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> pascalTriangleII(int idx) {
        ArrayList<Integer> cLine = new ArrayList(1);
        cLine.add(1);

        if(0 == idx ) return cLine;

        for(int i =1; i<= idx; i++){
            ArrayList<Integer> nLine = new ArrayList();
            nLine.add(1);
            for(int j =1; j < cLine.size(); j++){
                nLine.add(cLine.get(j-1) + cLine.get(j));
            }
            nLine.add(1);
            cLine= nLine;

        }
        return cLine;




    }

    public static void main(String[] args) {
        System.out.println(pascalTriangleII(4));
    }
}

package arrays;

public class MinCostToMoveChip {
    public static int minCostToMoveChip(int[] position) {
       int even = 0;
        for (int pos  : position) {
            if(pos % 2 ==0) even ++;
        }
        return Math.min(even, position.length -even);
    }

    public static void main(String[] args) {
        int[] pos = {1,1000000000};
        System.out.print(minCostToMoveChip(pos));
    }

}

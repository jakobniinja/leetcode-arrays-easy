package arrays;

public class CostClimbing {
    public static int  costClimbing(int[] cost) {
       int a = cost[0];
       int b = cost[1];
       int temp  =0;

        for (int i = 2; i < cost.length; i++) {
            temp = Math.min(a,b)+ cost[i];
            a = b;
            b = temp;
        }
        return Math.min(a,b);
    }

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.print(costClimbing(cost));
    }
}

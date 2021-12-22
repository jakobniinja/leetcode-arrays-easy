package arrays;

public class FindJudge {
    public  static int findJudge(int n, int[][] trust ) {

        int in[] = new int[n];
        boolean out[] = new boolean[n];

        for(int[] a : trust){
            out[a[0]-1 ]= true;
            in[a[1]-1] ++;
        }
        for (int i = 0; i < n; i++) {
            if(in[i]== n-1 && !out[i]) return i+1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};
        System.out.println(findJudge(3, trust));
    }
}

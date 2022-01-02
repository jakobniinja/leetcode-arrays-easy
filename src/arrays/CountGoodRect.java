package arrays;

public class CountGoodRect {
    public static int countGoodRect(int[][] rectangles) {

        int maxLen = 0, count =0;

        for(int[] r : rectangles){
            int l = Math.min(r[0], r[1]);
            if(maxLen < l){
                maxLen = l;
                count=1;
            }
            else if(maxLen==l) count ++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] rec ={{5,8}, {3,9}, {5,12}, {16,5}};
        System.out.println(countGoodRect(rec));
    }
}

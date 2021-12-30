package arrays;

public class DiagnolSum {
    public static int diagnolSum(int[][] matrix) {
       int sum = 0;
       int col = matrix[0].length -1;

       for( int i = 0; i< matrix.length; i++){
           sum += matrix[i][i];
           if(!(col ==i)) sum += matrix[i][col];
           col--;
       }
       return sum;
    }

    public static void main(String[] args) {
        int[] [] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.print(diagnolSum(mat));
    }
}

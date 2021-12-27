package arrays;

public class TicTacToe {
    public static String  ticTacToe(int[][] moves) {
        boolean[][] metrics = new boolean[3][3];

        for (int i = moves.length-1;  0 <= i; i-=2) {
            metrics[moves[i][0]][moves[i][1]] =true;
        }
        int lastX = moves[moves.length-1][0], lastY = moves[moves.length -1][1];
            if ((metrics[lastX][0] && metrics[lastX][1] && metrics[lastX][2]) || (metrics[0][lastY] && metrics[1][lastY] && metrics[2][lastY]) || (metrics[1][1] && ((metrics[0][0] && metrics[2][2]) || (metrics[0][2] && metrics[2][0])))) {
            return (moves.length % 2) ==0 ? "B" : "A";
        }
        return moves.length == 9 ? "Draw"  :"Pending";
    }


    public static void main(String[] args) {
        int[][] moves = {{0,0}, {1,1}, {2,0}, {1,0}, {1,2}, {2,1}, {0,1}, {0,2}, {2,2}};
        System.out.print(ticTacToe(moves));
    }
}

package arrays;

public class BaseballGame {
    public static int baseballGame(String[] ops) {
        int[] output = new int[ops.length];
        int x = 0, sum = 0;

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].charAt(0) == 'C') {
                output[x - 1] = 0;
                x--;
            } else if (ops[i].charAt(0) == 'D') {
                output[x] = 2 * output[x - 1];
                x++;
            } else if (ops[i].equals("+")) {
                output[x] = output[x - 2] + output[x - 1];
                x++;
            } else {
                output[x] = Integer.parseInt(ops[i]);
            }
        }
       for (int i : output){
           sum +=i;
       }
       return  sum;
    }
}

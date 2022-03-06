package CW;

import java.util.Arrays;

public class GuessSequence {
    public static int[] guessSequence(int num ) {
        int[] res = new int[num];
        if(num% 2 !=0){
            for (int i = 0; i < num; i++) {
                res[i] =i + 1;
            }
           return res;
        }
        else {
//                     {1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9};

            res[0] =1;

            int mid =num /2;
            int leftStart = mid +2;
            int rightStart = 2;

            for (int i = 1; i < mid; i++) {
                res[i]=leftStart++;
            }
            for (int i = mid; i < num; i++) {
               res[i]=rightStart++;
            }

            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(guessSequence(16)));
    }
}

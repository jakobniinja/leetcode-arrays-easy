package arrays;

public class DominoPairs {
    public static int dominoPairs(int[][] dominoes) {
        int res = 0;

        for (int i = 0; i < dominoes.length - 1; i++) {
            for (int j = i + 1; j < dominoes.length; j++) {
                int[] dominoe1 = dominoes[i];
                int[] dominoe2 = dominoes[j];

                if (dominoe1[0] == dominoe2[0] && dominoe1[1] == dominoe2[1] || dominoe1[0] == dominoe2[1] && dominoe1[1] == dominoe2[0]) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] domnioes = { {1,2}, {1,2}, {1,1}, {1,2}, {2,2} };
        System.out.print(dominoPairs((domnioes)));
    }

}

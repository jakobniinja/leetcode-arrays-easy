package dynamic;

public class MaxiumumGenerated {
    public  static int getMaxGenerated(int n) {
        if (n < 2) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            if ((i & 1) == 0) {
                arr[i] = arr[i / 2];
            } else {
                arr[i] = arr[i / 2] + arr[(i / 2) + 1];
            }
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMaxGenerated(15));
    }
}


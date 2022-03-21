package dynamic;

public class DivisorGame {
    public static boolean divisorGame(int n) {
        boolean[] dp = new boolean[n+2];

        dp[1] = false;
        dp[2] = true;

        for(int i =3; i<=n; i++){
            for(int j =1; j<i; i++){
                if((i%j ==0) != dp[i-j]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        System.out.println(divisorGame(316));
    }
}

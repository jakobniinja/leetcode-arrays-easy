package arrays;

public class SlowestKey {
    public static char slowestKey(int[] releaseTimes, String keyPressed) {

        for( int i = releaseTimes.length -1; i > 0; i--){
            releaseTimes[i] -= releaseTimes[i-1];
        }
        int max = Integer.MIN_VALUE;
        int maxLet= -1;
        for( int i =0; i < releaseTimes.length; i++){
            if(releaseTimes[i] > max){
                max = releaseTimes[i];
                maxLet = keyPressed.charAt(i);
            }else if (releaseTimes[i] == max){
                if(keyPressed.charAt(i) > maxLet){
                    maxLet = keyPressed.charAt(i);
                }
            }
        }
        return (char) maxLet;

    }

    public static void main(String[] args) {
        int[] releaseTimes = {9,29,49,50};
        System.out.println(slowestKey(releaseTimes, "cbcd"));
    }
}

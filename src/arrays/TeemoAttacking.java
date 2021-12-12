package arrays;

public class TeemoAttacking {
    public static int teemoAttacking( int[] timeSeries, int duration) {
        int count =0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            if( duration + timeSeries[i] < timeSeries[i+1] ){
                count +=duration;
            }
            else if (duration + timeSeries[i+1]>= timeSeries[i] ){
               count += timeSeries[i+1] - timeSeries[i];
            }
        }
        return count + duration;
    }

    public static void main(String[] args) {
        int[] times = {1,4};
        System.out.print(teemoAttacking(times, 2));
    }
}

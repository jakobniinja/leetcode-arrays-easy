package arrays;

public class MaxDistance {
    public static int maxDistance(int[] colors) {
        int max =0;

        for(int i =0; i< colors.length; i++){
            for(int j =0; j< colors.length;j ++){
                if(colors[i] != colors[j]){
                    max = Math.max(max, Math.abs(j-i));
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,6,1,1,1};
        System.out.println(maxDistance(arr));
    }
}

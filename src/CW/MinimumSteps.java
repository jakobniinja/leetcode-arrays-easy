package CW;

import java.util.Arrays;

public class MinimumSteps {
    public static int minimumSteps(int[] numbers, int k) {

        Arrays.sort(numbers);
        int sum = 0, i =0;
        while(sum <=k){
            sum += numbers[i];
            i++;
        }
        return i -1;

    }

    public static void main(String[] args) {
        System.out.println(minimumSteps(new int[] {4,6,3},7));
        System.out.println(minimumSteps(new int[] {19,98,69,28,75,45,17,98,67},464));
    }
}

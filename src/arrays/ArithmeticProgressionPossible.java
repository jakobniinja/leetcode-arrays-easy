package arrays;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticProgressionPossible {
     public static boolean canMakeArithmeticProgression(int[] arr) {
     if(arr ==null||arr.length ==0)

    {
        return true;
    }

    int a = findMin(arr);
    int last = findMax(arr);
    int d = (last - a) / (arr.length - 1);
    Set<Integer> data = new HashSet<>();
        for(
    int a_ :arr)

    {
        data.add(a_);
    }

        for(
    int i = 0;
    i<arr.length;i++)

    {
        if (!data.contains(a)) {
            return false;
        }

        a += d;
    }


        return true;
}

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2};
        System.out.print( canMakeArithmeticProgression(arr));
    }

}

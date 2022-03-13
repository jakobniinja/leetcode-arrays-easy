package CW;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsNice {
    public static boolean isNice(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        for (int i: arr){
            if(!set.contains(i+1) && !set.contains(i-1)){
                return false;
            }
        }

        return !set.isEmpty();
    }

    public static boolean isNice2(Integer[] arr) {
        return Arrays.stream(arr)
                .filter(i -> (Arrays.asList(arr).contains(i + 1) || Arrays.asList(arr).contains(i - 1)))
                .count() == arr.length && arr.length > 1;
    }


    public static void main(String[] args) {
//        Integer[] list = new Integer[]{10,10,2,2,3};
        Integer[] list = new Integer[]{5,4,3,2,1};
        System.out.println(isNice(list));
    }
}

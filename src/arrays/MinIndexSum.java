package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class MinIndexSum {
    public static HashSet<String>  minIndexSum(String[] list1, String[] list2 ) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < list1.length; i++) {
            list.add(list1[i]);
        }
        for (int i = 0; i < list2.length; i++) {
            if (list.contains(list2[i])) {
                hs.add(list2[i]);
            }

        }
        return  hs;
    }

    public static void main(String[] args) {
        String[] list1= {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2= {"KFC","Shogun","Burger King"};

        System.out.print(minIndexSum(list1, list2));
    }
}

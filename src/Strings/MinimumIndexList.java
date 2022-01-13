package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexList {
    public static String[]  minimumIndexList(String[] list1, String[] list2 ) {

        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        for(int i =0; i< list1.length; i++){
            map.put(list1[i], i);
        }

        for(int i =0; i< list2.length; i++){
            if(map.containsKey(list2[i])){
                int val= i+map.get(list2[i]);
                if(val<min){
                    ans = new ArrayList<>();
                    ans.add(list2[i]);
                    min =val;
                }
                else if (val==min ) ans.add(list2[i]);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"},
                list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(minimumIndexList(list1, list2)));
    }
}

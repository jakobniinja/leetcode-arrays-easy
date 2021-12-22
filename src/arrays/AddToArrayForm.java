package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
    public static List<Integer> addToArrayForm(int[] num , int k  ){
        ArrayList<Integer> list  = new ArrayList<>();

        for (int i = num.length-1; i >= 0 || k> 0; i--) {
           if( i>= 0){
               list.add((num[i]+k) % 10);
               k=(num[i]+ k)/10;
           }else {
               list.add(k%10);
               k/=10;
           }
        }
        Collections.reverse(list);
        return list ;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5};
        System.out.print(addToArrayForm(nums,806));
    }
}

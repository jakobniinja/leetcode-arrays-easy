package arrays;

import java.util.Arrays;

public class SortByBit {
    public static int[] sortByBit(int[] arr) {
        int[] bits  = new int[arr.length];
        int[] ans = new int[arr.length];

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            int n = arr[i];
            while( n> 0){
                if((n & 1) ==1){
                    count ++;
                }
                n >>=1;
            }
            bits[i] = count;
        }
        int l =0;
        for (int j = 0; j <= 14; j++) {
            int length = 0;
            for (int k = 0; k < bits.length; k++) {
                if(j == bits[k]){
                    length ++;
                    ans[l]= arr[k];
                    l++;
                }


            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
        System.out.println(Arrays.toString(sortByBit(arr)));
    }

}

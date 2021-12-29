package arrays;

import java.util.Arrays;

public class AverageSalary {
    public static double  averageSalary(int[] salary) {
        Arrays.sort(salary);
        int n  = salary.length -1;
       double total = 0.0;
        for(int i = 1; i< n ; i++){
             total += salary[i];
        }

        return total /(n-1);
    }

    public static double  averageSalary2(int[] salaries) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for( int s : salaries){
            if(s > max) max = s;
            if(s < min) min = s;
        }

        int count=0, sum =0;
        for( int s : salaries){
            if(s != min && s != max){
               sum += s;
               count ++;
            }
        }
        return  (double) sum/count;
    }

    public static void main(String[] args) {
        int[] nums = {4000,3000,1000,2000};
        System.out.print(averageSalary2(nums));
    }
}

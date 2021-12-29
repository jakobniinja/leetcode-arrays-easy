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

    public static void main(String[] args) {
        int[] nums = {4000,3000,1000,2000};
        System.out.print(averageSalary(nums));
    }
}

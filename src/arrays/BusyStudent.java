package arrays;

public class BusyStudent {
    public static int  busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count =0;
        for(int i = 0; i < startTime.length; i++){
            if( queryTime>=startTime[i] && queryTime<= endTime[i] ) count ++;
        }
       return  count ++;
    }

    public static void main(String[] args) {
       int[] startTime = {4}, endTime = {4};
        System.out.print(busyStudent(startTime, endTime,4 ));
    }
}


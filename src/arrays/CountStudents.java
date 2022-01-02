package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class CountStudents {
    public static int countStudents(int[] st, int[] sa) {
        Queue<Integer> stud = new LinkedList<>();
        Queue<Integer> sand = new LinkedList<>();
        int n = st.length;

        for( int i =0; i< n; i++){
            stud.offer(st[i]);
            sand.offer(sa[i]);
        }
        int flag =0;
        while(sand.size()>0){
            if(stud.peek() == sand.peek()){
                stud.poll();
                sand.poll();
                flag =0;
            }else {
                stud.offer(stud.poll());
                flag ++;
            }
            if(flag == sand.size()) return sand.size();
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] st = {1,1,1,0,0,1};
        int[] sa = {1,0,0,0,1,1};
        System.out.println(countStudents(st, sa));

    }
}

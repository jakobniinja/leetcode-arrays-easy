package arrays;

public class MinOperations {

    public static int minOperations(String[] logs) {
        int count = 0;
        for(String temp : logs){
           if(temp.substring(0,2).equals("..") )
               count =(count -1) <0 ? 0: (count -1);
           else if(!temp.substring(0,2).equals("./"))
               count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
    }
}

package arrays;

public class FinalValueAfterOP {
    public static int finalValueAfterOP(String[] operations) {
        int count = 0;

        for( int i =0; i< operations.length; i++){
            if(operations[i].contains("-"))
                count -=1;
            if(operations[i].contains("+"))
                count +=1;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOP(operations));
    }
}

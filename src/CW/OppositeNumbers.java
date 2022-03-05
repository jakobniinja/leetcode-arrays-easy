package CW;

public class OppositeNumbers {
    public static int oppositeNumbers(int num) {
        if(num != 0){
           return -1 *  num;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(oppositeNumbers(-1));
        System.out.println(oppositeNumbers(0));
        System.out.println(oppositeNumbers(2));
        System.out.println(oppositeNumbers(3));
    }
}

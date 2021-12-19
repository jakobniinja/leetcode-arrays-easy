package arrays;

public class LemonadeChange {
    public static boolean lemonadeChange( int[] bills) {

        int fives  = 0, tens= 0;

        for (int x : bills) {
            if(x==5){
                fives ++;
            }else if(x ==10){
                tens ++;
                fives --;
            }else {
                if(tens> 0){
                    tens --;
                    fives--;
                }else {
                    fives--;
                    fives--;
                    fives--;
                }
            }

            if(fives < 0 ||tens < 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] bills = {5,5,10,10,20};
        System.out.print(lemonadeChange(bills));
    }
}

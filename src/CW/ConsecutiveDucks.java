package CW;

public class ConsecutiveDucks {
    public static boolean consecutiveDucks(int n) {
        if(n <2) return false;
        if(n % 2 ==1) return true;
        else {
            return consecutiveDucks(n /2);
        }
    }

    public static void main(String[] args) {
////        true
//        System.out.println(consecutiveDucks(382131));
////        true
//        System.out.println(consecutiveDucks(400779));
////        true
//        System.out.println(consecutiveDucks(17209));
////        false
        System.out.println(consecutiveDucks(512));
    }
}

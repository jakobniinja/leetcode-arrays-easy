package CW;

public class TeensBirthday {
    public static String teensBirthday(int age) {
        int base = age /2;
        int remainder = age % 2 ;
        int newAge = 20 + remainder;
        return String.format("%d? that's just %d , in base %d!", age, newAge, base);
    }

    public static void main(String[] args) {
        System.out.println(teensBirthday(32));
        System.out.println(teensBirthday(39));
        System.out.println(teensBirthday(22));
        System.out.println(teensBirthday(65));
        System.out.println(teensBirthday(83));
    }
}

package CW;


import static java.util.stream.Stream.of;

public class CountShifter {
    public static int countShifter(String s) {
        return (int)  of(s.split(" ")).distinct().filter(w -> w.matches("[HIMNOSWXZ]+")).count();
    }

    public static void main(String[] args) {
        System.out.println(countShifter("ON"));
        System.out.println(countShifter("OS IS UPDATED"));
        System.out.println(countShifter("JS"));
        System.out.println(countShifter("I III I III"));
        System.out.println(countShifter(""));
    }

}

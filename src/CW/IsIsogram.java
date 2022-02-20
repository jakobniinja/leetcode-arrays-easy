package CW;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class IsIsogram {
    public static boolean isIsogram(String str ) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }



    public static void main(String[] args) {
        System.out.println(isIsogram("aba"));
    }
}


package CW;

public class WhatCentury {
    public static String  whatCentury(int year) {
        int century = (year +99) /100;
        if(century/10 ==1) return century+ "th";

        switch (century % 10){
            case 1: return century + "st";
            case 2: return century + "nd";
            case 3: return century + "rd";
            default: return century + "th";
        }
    }

    public static void main(String[] args) {
        System.out.println(whatCentury(2154));
    }
}

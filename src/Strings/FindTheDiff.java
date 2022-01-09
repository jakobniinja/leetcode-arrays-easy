package Strings;

public class FindTheDiff {
    public static char findTheDiff(String s, String t) {
        int sumS = 0, sumT=0;

        for(char ch : s.toCharArray()){
            sumS += ch;
        }
        for(char ch : t.toCharArray()){
            sumT +=ch;
        }
        return (char)  (sumT - sumS);
    }

    public static void main(String[] args) {
        String s = "", t = "y";
        System.out.println(findTheDiff(s,t));
    }
}

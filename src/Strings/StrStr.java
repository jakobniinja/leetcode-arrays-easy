package Strings;

public class StrStr {
    public static int strStr(String hayStack, String needle) {
        if(needle.isEmpty()) return 0;

        for(int i =0; i<hayStack.length();i++){
           return hayStack.indexOf(needle.substring(0, needle.length())) ;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack= "hello";
        System.out.println(strStr(haystack, "ll"));
    }
}

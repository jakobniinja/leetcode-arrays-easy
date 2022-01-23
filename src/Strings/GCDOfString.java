package Strings;

public class GCDOfString {
    public static String gCDOfString(String str1, String str2) {

        int size1 = str1.length();
        int size2 = str2.length();
        if (size1 < size2) return  gCDOfString(str2, str1);

        if(size1 == size2){
            if(str1.equals(str2))return str1;
            else return "";
        }
        if(str1.startsWith(str2)){
            return gCDOfString(str1.substring(str2.length()), str2);
        }else return "";
    }

    public static void main(String[] args) {
        String str1 =  "ABABAB", str2 = "ABAB";
        System.out.println(gCDOfString(str1, str2));
    }
}

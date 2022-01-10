package Strings;

public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k ) {
       int N = s.length();
        int count = 0;
        StringBuilder sb = new  StringBuilder();
        N--;
        for(int i = N ; i >= 0 ; i--) {
            if (s.charAt(i) != '-') {

                if (count != 0 && count % k == 0) {
                    sb.append('-');
                }

                sb.append(Character.toUpperCase(s.charAt(i)));
                count++;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s ="5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licenseKeyFormatting(s,k ));
    }
}

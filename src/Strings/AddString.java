package Strings;

public class AddString {
    public static String addString(String num1, String num2) {
        StringBuilder res= new StringBuilder();
        int i = num1.length() -1;
        int j =num2.length() -1 ;
        int carry =0;

        while(i >=0 ||j >= 0){
            int sum = carry;
            if(i>= 0) {
                sum += num1.charAt(i--) - '0';
            }
            if(j>=0){
                sum += num2.charAt(j--) - '0';
            }
            res.append(sum % 10);
            carry = sum /10;
        }
        if(carry!= 0) res.append(carry);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "0", num2 = "0";
        System.out.println(addString(num1, num2));
    }
}

package Strings;

public class ToLowerCase {
    public static String toLowerCase(String s) {
        char[] arr= s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i =0; i< arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                char toLower = Character.toLowerCase(arr[i]);
                sb.append(toLower);
            }else {
                char notLower = arr[i];
                sb.append(notLower);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       String s = "Räven Är TUUUng";
        System.out.println(toLowerCase(s));
    }

}

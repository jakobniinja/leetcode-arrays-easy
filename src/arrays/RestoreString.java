package arrays;

public class RestoreString {
    public static String  restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];

        for( int i = 0; i< indices.length; i ++){
            ch[indices[i] ] = s.charAt(i);
        }
        String str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.print(restoreString("codeleet", indices));
    }
}

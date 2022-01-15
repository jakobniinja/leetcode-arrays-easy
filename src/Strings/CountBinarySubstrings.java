package Strings;

public class CountBinarySubstrings {
    public static int  countBinarySubstrings(String s ) {
        int start = 0, ans = 0;
        char[] arr = s.toCharArray();

        for(int i =1; i<arr.length; i++){
           if(arr[i] != arr[i-1] ){
               ans++;
               start =i-1;
           }else if (start > 0 && arr[--start] != arr[i] )
               ans++;
           else start =0;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s ="00110011";
        System.out.println(countBinarySubstrings(s));
    }
}

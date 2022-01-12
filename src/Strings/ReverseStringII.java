package Strings;

public class ReverseStringII {
    public static String reverseStringII(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        int n = arr.length;

        while (i < n) {

            if (i + k < n) {
                reverse(arr, i, i+k -1);
            }
            else{
                reverse(arr, i , n-1);
            }
            i += 2*k;
        }
        return new String(arr);
    }
    private static void reverse(char[] arr, int start, int end){
        int low = start, high = end;

        while(low < high){
            if(arr[low] != arr[high]){
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
            low++;
            high --;
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reverseStringII(s, 2));

    }
}

package CW;

public class GetFreeUrinals {
    public static int getFreeUrinals(String urinals) {
        if(urinals.contains("11")) return -1;
        if(urinals.equals("0")) return 1;
        if (urinals.equals("1")) return 0;
        char[] arr = urinals.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if(i==0){
                if(arr[i] == '0' && arr[i+1] == '0'){
                    arr[i] = '1';
                    count++;
                }
            }
            if( i> 0){
                if(arr[i] =='0' && arr[i-1]=='0' && arr[i+1] == '0'){
                    arr[i] ='1';
                    count ++;
                }
            }
        }
        if(arr[arr.length-1] =='0' && arr[arr.length-2] == '0' )
            count ++;
        return count ;
    }

    public static void main(String[] args) {
        System.out.println(getFreeUrinals("10001"));
        System.out.println(getFreeUrinals("1001"));
        System.out.println(getFreeUrinals("00000"));
        System.out.println(getFreeUrinals("0000"));
        System.out.println(getFreeUrinals("0100"));
        System.out.println(getFreeUrinals("10000"));
    }
}

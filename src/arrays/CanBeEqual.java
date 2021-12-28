package arrays;

public class CanBeEqual {
    public static boolean canBeEqual(int[] target, int[] arr) {
        int count = 0;
        for( int i =0; i < target.length; i++){
            for( int j = 0; j < arr.length; j++){
                if(target[i] == arr[j]){
                   arr[j]=-1;
                   count ++;
                   break;
                }
            }
        }
        if(count == target.length) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] target = {1,2,3,4}, arr={2,4,1,2};
        System.out.println(canBeEqual(target, arr));
    }
}

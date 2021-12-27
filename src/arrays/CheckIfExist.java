package arrays;

public class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr.length; n++) {
                if(m!=n && arr[m] * 2 == arr[n]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,13,11};
        System.out.print(checkIfExist(arr));
    }
}

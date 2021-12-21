package arrays;

public class MinDeletionSize {

    public  static int minDeletionSize( String[] strs ) {
            int n=strs[0].length();
    int ans=0;

for(int j=0;j<n;j++) {
    for (int i = 1; i < strs.length; i++) {

        if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
            ans++;
            break;
        }

    }
}

    return ans;
    }

    public static void main(String[] args) {
        String[] list = {"cba","daf","ghi"};
        System.out.print(minDeletionSize(list));
    }
}

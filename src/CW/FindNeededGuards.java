package CW;

public class FindNeededGuards {
    public static int findNeededGuards(boolean[] k) {
        int res =0;
        for(int i =0; i< k.length -1; i++){
            if(!k[i] && !k[i + 1]){
                res +=1;
                k[i+1] = true;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(findNeededGuards(new boolean[]{true, false,true,false }));
    }
}

package arrays;

public class CanPlaceFlower {
    public static boolean canPlaceFlower( int[] flowerbed, int n ) {
        int k =flowerbed.length;
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (
                    flowerbed[i] == 0 &&
                            (i == 0 || flowerbed[i - 1] == 0) &&
                            (i == n - 1 || flowerbed[i - 1] == 0) &&
                            (i == n - 1 || flowerbed[i + 1] == 0)


            ) {

                flowerbed[i] =1; count ++;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[]flowerbed = {1,0,0,0,1};
        System.out.println(canPlaceFlower(flowerbed, 2));
    }
}

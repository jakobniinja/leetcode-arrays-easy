package arrays;

public class ImageSmoother {

    public static int[][] imageSmoother( int[][] img ) {
        int [][] res = new int[img.length][img[0].length];

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
               res[i][j]  = getSmoothedValue(img,i, j);
            }
        }
        return res;
    }
    private static int getSmoothedValue(int[][] img, int x, int y) {
        int sum = 0, count = 0;

        for (int i = x-1; i <= x+1; i++) {
            if(i< 0|| i >= img.length) continue;
            for (int j = y-1; j < y+1; j++) {
               if( j< 0|| j >= img[0].length) continue;
                sum+=img[i][j];
               count++;
            }

        }
        return sum / count;
    }

}

package CW;

public class WaterBombs {
    public static int  waterBombs(String fire, int w) {
        String[]  sections = fire.split("Y");
        int b =0;
        for(String s : sections){
            b += Math.ceil((double) s.length() / w);
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(waterBombs("xxxxYxYx",4));
        System.out.println(waterBombs("xxYxx", 3));
    }
}

package CW;

public class FusionChamber {
    public static int[] fusionChamber(int c, int h, int o) {
        int water = Math.min(h/2, o);
        int carbonDioxide = Math.min(c, (o-water) /2);
        int methane = Math.min(c - carbonDioxide, (h -water * 2) /4);
        return  new int [] {water,carbonDioxide, methane};
    }

    public static void main(String[] args) {

    }
}

package CW;

public class TwiceAsOld {
    public static int twiceAsOld(int dadAge, int sonAage) {
        int count = 0;

        while (sonAage * 2 != dadAge) {
            if (sonAage * 2 > dadAge) {
                dadAge++;
                count++;
            } else {
                sonAage++;
                dadAge++;
                count++;
            }
        }
        return count;
    }
}

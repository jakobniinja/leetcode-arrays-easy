package CW;

public class Plant {
    public static String plant(char seed, int water ,int fert, int temp) {

        return
                ((temp < 31) && (temp > 19)) ?
                        ("-".repeat(water)+ ("" + seed).repeat(fert)).repeat(water)
                        : "-".repeat(water* water)+seed;
    }

}

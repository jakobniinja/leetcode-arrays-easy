package CW;

public class AreaOfPerimeter {
    public static int areaOfPerimeter(int l, int w) {

        return w == l ? w * l : (w + l) * 2;
    }

    public static void main(String[] args) {
        System.out.println(areaOfPerimeter(3,3));
        System.out.println(areaOfPerimeter(4,3));
    }
}

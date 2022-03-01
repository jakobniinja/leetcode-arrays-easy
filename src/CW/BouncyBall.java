package CW;

public class BouncyBall {
    public static int bouncyBall(double h, double b, double w) {

        if(h<= 0|| b <= 0|| w>h ){
             return -1;
        }

        int count =1;
        while(h * b > w){
            count =count +2;
            h = h*b;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bouncyBall(3.0, 0.66, 1.5));
        System.out.println(bouncyBall(30.0, 0.66, 1.5));
    }
}

package CW;

public class Movie {
    public static int movie(int card, int ticket, double perc) {
        int n =0;
        double b  = card;
        while(ticket * n <= Math.ceil(b)){
            b += ticket * Math.pow(perc, ++n);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(movie(500, 15, 0.6));
    }
}

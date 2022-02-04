package CW;

public class RedKnight {
    public static PawnDistance redKnight(int knight, long pawn) {
        return new PawnDistance((pawn - knight) % 2 > 0 ? "Black" : "White", 2 * pawn);
    }


    private static class PawnDistance {
        private String color;
        private long distance;

        public PawnDistance(String color, long distance) {
            this.color = color;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        System.out.println(new PawnDistance("Black", 14));

        System.out.println(new PawnDistance("Black", 12));

        System.out.println(new PawnDistance("White", 10));
    }
}

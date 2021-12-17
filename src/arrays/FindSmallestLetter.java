package arrays;

public class FindSmallestLetter {
    public static char findSmallestLetter( char[] letters, char target ) {
        int right  =letters.length -1 ;

        for (int i = 0; i <= right; i++) {
            int compare = Character.compare(letters[i], target);

            if(compare> 0){
               return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.print(findSmallestLetter(letters,'c' ));
    }
}

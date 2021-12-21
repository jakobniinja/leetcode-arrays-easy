package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderLogFiles {

    public static String[] reorderLogFiles( String[] logs ) {
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Splitting the words into two arrays, first by identifier, then by contents
                String[] first = s1.split(" ", 2);
                String[] second = s2.split(" ", 2);

                //Checking first character of second word in array
                boolean isFirstDigit = Character.isDigit(first[1].charAt(0));
                boolean isSecondDigit = Character.isDigit(second[1].charAt(0));

                if (isFirstDigit && !isSecondDigit)
                    return 1; //We want to prioritize digits
                if (!isFirstDigit && isSecondDigit)
                    return -1; //deprioritize first.
                if (isFirstDigit && isSecondDigit)
                    return 0; //Don't matter if they're both digits, they are equal

                int score = first[1].compareTo(second[1]);//Calculate if first is bigger than second.

                if (score == 0)//If they are equal, sort by identifier.
                    return first[0].compareTo(second[0]);

                return score;//else return score;
            }
        });

        return logs;
    }


    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println(Arrays.toString(reorderLogFiles(logs)));
    }
}

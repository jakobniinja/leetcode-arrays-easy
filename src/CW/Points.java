package CW;

public class Points {
    public static int points(String[] games) {

        int totalScore = 0;
        for(String ch : games){
            int first = ch.charAt(0);
            int second = ch.charAt(2);
            if(first == second ) totalScore++;
            if(first > second) totalScore +=3;
        }
        return totalScore;
    }
}

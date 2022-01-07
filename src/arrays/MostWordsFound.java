package arrays;

public class MostWordsFound {
    public static int mostWordsFound(String[] sentences) {
        int maxWords = Integer.MIN_VALUE;
        
        for(var sentence: sentences){
            var spaces =1;
            for(var i =0; i< sentence.length(); i++){
                if(Character.isSpaceChar(sentence.charAt(i)))
                    spaces++;
            }
            maxWords = Math.max(maxWords, spaces);
        }
        return maxWords;
    }

    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }
}

package arrays;

import java.util.TreeMap;

public class ShortestCompletingWord {
    public  static String shortestCompletingWord( String licensePlate, String[] word  ) {
            if (word ==null || word.length ==0) return "";
           licensePlate = licensePlate.trim().toLowerCase();

        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char c : licensePlate.toCharArray()) if(Character.isLetter(c)) map.put(c, map.getOrDefault(c,0)+1) ;
       int len = Integer.MAX_VALUE;
       String res = "";
       for (String w : word){
           if(helper(map, w.toLowerCase()) && w.length() < len){
               len = w.length();
               res = w;
           }
        }
        return res;
    }

    private static boolean helper(TreeMap<Character, Integer> map, String w) {
                  TreeMap<Character, Integer> target = new TreeMap<>();
          for(char c : w.toCharArray()) if (Character.isLetter(c)) target.put(c, target.getOrDefault(c, 0)+1 );

          for (Character c: map.keySet()) if(map.get(c) > target.getOrDefault(c, 0)) return false;
        return true;
    }

    public static void main(String[] args) {
        String[] word = {"step","steps","stripe","stepple"};
        System.out.print(shortestCompletingWord("1s3 PSt", word));
    }
}

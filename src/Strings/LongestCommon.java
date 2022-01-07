package Strings;

public class LongestCommon {
    public static String longestCommon(String[] strs) {
        String prefix = strs[0];

        for(int i = 1; i< strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] nums = {"flower","flow","flight"};
        System.out.println(longestCommon(nums));
    }

}

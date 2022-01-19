package arrays;

public class FreqAlpha {
    public static String freqAlpha(String s ) {
       String ans ="";
       char c;

       for(int i =s.length()-1; i>=0 ; i-- ){
           c = s.charAt(i);

           if(c=='#'){
               String updatedC = s.charAt(i-2) +""+ s.charAt(i-1);
               ans = (char)(Integer.parseInt(updatedC)+96) + ans;

               i = i-2;
           }else{
               ans = (char)(Integer.parseInt(String.valueOf(c)) +96) + ans;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(freqAlpha(s));
    }
}

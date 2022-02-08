package CW;

public class UglifyWord {
    public static String uglifyWord(String s) {
        StringBuilder sb  =new StringBuilder();
        boolean flag = true;
        for (char c: s.toCharArray()){
            if(Character.isAlphabetic(c)){
                c = flag ? Character.toUpperCase(c) : Character.toLowerCase(c);
                flag = !flag;
            }else {
                flag = true;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(uglifyWord("qwe123asdf456zxc"));
        System.out.println(uglifyWord("Hello World"));
    }

}

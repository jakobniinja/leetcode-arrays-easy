package Strings;

import java.util.Stack;

public class BooleanValid {
    public static boolean booleanValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char st : s.toCharArray()){
            if(st =='(' ||st =='{' ||st =='['){
                stack.push(st);
            }else {
                if(stack.empty()){
                    return false;
                }else {
                    char top = (Character)  stack.peek();
                    if (st == ')' && top == '(' ||
                            st == '}' && top == '{' ||
                            st == ']' && top == '['

                    ) {

                        stack.pop();
                    } else{
                        return false;
                    }
                }
            }
        }
        if(stack.empty()) return true;
        else return false;
    }

    public static void main(String[] args) {
       String s = "(}";
        System.out.println(booleanValid(s));
    }
}

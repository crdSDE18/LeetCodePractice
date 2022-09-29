package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "(])";

        System.out.println(isValid(s1));//true
        System.out.println(isValid(s2)); //true
        System.out.println(isValid(s3)); //false
        System.out.println(isValid(s4));//false
    }

    private static  boolean isValid(String s){
        char [] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(Character c: chars){
            if(c.equals('{') || c.equals('[') || c.equals('(')){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) {//considering check is empty at every if to save time
                    return false;
                }
                if (c == '}' && stack.peek() != '{') {
                    return false;
                }
                if (c == ']' && stack.peek() != '[') {
                    return false;
                }
                if (c == ')' && stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
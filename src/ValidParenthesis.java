package src;

import java.util.Stack;

public class ValidParenthesis {
    // Initial approach
    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        for (int index = 0; index < length; index++) {
            char currentChar = s.charAt(index);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') stack.push(currentChar);
            else if (currentChar == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            } else if (currentChar == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return false;
            } else if (currentChar == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str="{]";
        ValidParenthesis obj=new ValidParenthesis();
        System.out.println(obj.isValid(str));
    }
}

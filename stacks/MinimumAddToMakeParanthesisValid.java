package stacks;

import java.util.Stack;

public class MinimumAddToMakeParanthesisValid {
    public static void main(String[] args) {
        String s = "())";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '('){
                stack.push(ch);
            }else {
                if (!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else {
                    stack.push(ch);
                }

            }
        }

        System.out.println(stack.size());
    }
}

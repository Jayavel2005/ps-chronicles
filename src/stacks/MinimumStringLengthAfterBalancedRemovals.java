package stacks;

import java.util.Stack;

public class MinimumStringLengthAfterBalancedRemovals {
    public static void main(String[] args) {
        String s = "aaabb";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && (stack.peek() == 'a' && ch == 'b')) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        System.out.println(stack);
    }
}

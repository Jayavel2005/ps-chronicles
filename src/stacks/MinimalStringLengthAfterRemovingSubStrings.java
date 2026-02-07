package stacks;

import java.util.Stack;

public class MinimalStringLengthAfterRemovingSubStrings {
    public static void main(String[] args) {
        String s = "ACBBD";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && (stack.peek() == 'A' && ch == 'B' || stack.peek() == 'C' && ch == 'D')) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        System.out.println(stack.size());
    }
}

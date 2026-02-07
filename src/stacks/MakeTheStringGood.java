package stacks;

import java.util.Stack;

public class MakeTheStringGood {
    public static void main(String[] args) {
        String s = "abBAcC";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && (stack.peek() + 32 == ch || stack.peek() - 32 == ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        System.out.println(res
                .reverse().toString());
    }
}

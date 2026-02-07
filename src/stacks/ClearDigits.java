package stacks;

import java.util.Stack;

public class ClearDigits {
    public static void main(String[] args) {
        String s = "cb34";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && (Character.isAlphabetic(stack.peek()) && Character.isDigit(ch))) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());

        }

        System.out.println(res.reverse().toString());
    }
}

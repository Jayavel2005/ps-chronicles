package stacks;

import java.util.Stack;

public class ResultingStringAfterRemovals {
    public static void main(String[] args) {
        String s = "zadb";
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() &&
                    (Math.abs(stack.peek() - ch) == 1 ||
                            Math.abs(stack.peek() - ch) == 25)) {

                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        System.out.println("sdferg".indexOf('z'));

        System.out.println(stack);
    }
}

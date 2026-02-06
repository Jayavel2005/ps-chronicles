package stacks;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backSpaceCompare(s).equals(backSpaceCompare(t)));

    }

    public static String backSpaceCompare(String str) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.toString();
    }
}

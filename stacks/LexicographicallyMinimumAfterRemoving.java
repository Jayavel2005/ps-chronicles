package stacks;

import java.util.Stack;

public class LexicographicallyMinimumAfterRemoving {
    public static void main(String[] args) {
        String s = "aaba*";

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == '*') {
                char min = 'a';
                while(!stack.isEmpty()){

                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
//        return res.reverse().toString();
    }
}

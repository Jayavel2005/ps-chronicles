package stacks;

import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch != '*'){
                stack.push(ch);
            }else {
                if (!stack.empty()){
                    stack.pop();
                }
            }
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }

        System.out.println(res.reverse());
    }
}

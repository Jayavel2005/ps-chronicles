package stacks;

import java.util.Stack;

public class MaximumScoreFromRemovingSubs {
    public static void main(String[] args) {
        String s = new StringBuilder("cdbcbbaaabab").reverse().toString();

        int x = 4, y = 5;
        int score = 0;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && (stack.peek() == 'a' && ch == 'b')) {
                score += y;
                stack.pop();
            }
            else if(!stack.isEmpty() && (stack.peek() == 'b' && ch == 'a')) {
                score += x;
                stack.pop();
            }else {
                stack.push(ch);
            }
        }

        System.out.println(score);
    }
}

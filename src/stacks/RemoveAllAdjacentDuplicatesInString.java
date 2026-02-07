package stacks;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stack= new Stack<>();
        for (char ch : s.toCharArray()){
            if (!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else stack.push(ch);
        }


    }
}

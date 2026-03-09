import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {

    static int precedence(char ch){
        if (ch == '^') {
            return 3;
        } else if (ch == '/' || ch == '*') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter infix expression: ");
        String exp = in.nextLine();

        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(char ch : exp.toCharArray()){
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                res.append(ch);  
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    res.append(stack.pop());   
                }
                stack.pop();  
            }
            else { 
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    res.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        System.out.println("Postfix expression: " + res);
    }
}
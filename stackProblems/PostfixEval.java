import java.util.Scanner;
import java.util.Stack;
public class PostfixEval {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] tokens = in.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            }
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (token) {
                    case "+" ->{
                        stack.push(val2 + val1);
                    }
                    case "-" -> {
                        stack.push(val2 - val1);
                    }
                    case "*" ->{
                        stack.push(val2 * val1);
                    }
                    case "/" ->{
                        stack.push(val2 / val1);
                    }
                    case "^" ->{
                        stack.push((int)Math.pow(val2, val1));
                    }
                }
                }
            }
            System.out.println(stack.pop());
        }
    }

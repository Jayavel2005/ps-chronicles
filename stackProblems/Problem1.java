import java.util.Scanner;
import java.util.Stack;

public class Problem1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = in.nextLine();
        String[] words = str.split(" ");

        Stack<String> stack = new Stack<>();

        for(String word : words){
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop();
            }else{
                stack.push(word);
            }
        }
        System.out.println(stack.size());

        in.close();
    }
}
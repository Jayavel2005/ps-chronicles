package stacks;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "3+5 / 2 ";
        String symbols = "+-/*";

        Stack<Integer> intStack = new Stack<>();
        Stack<Character> symStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                intStack.push(ch - '0');
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                symStack.push(ch);
            } else if (ch == ' ') continue;

        }

        while (!symStack.isEmpty() && !intStack.isEmpty()) {
            char symbol = symStack.pop();
            switch (symbol) {
                case '+' -> {
                    int b = intStack.pop();
                    int a = intStack.pop();
                    intStack.push(a + b);
                }
                case '-' -> {
                    int b = intStack.pop();
                    int a = intStack.pop();
                    intStack.push(a - b);
                }
                case '*' -> {
                    int b = intStack.pop();
                    int a = intStack.pop();
                    intStack.push(a * b);
                }
                case '/' -> {
                    int b = intStack.pop();
                    int a = intStack.pop();
                    intStack.push(a / b);
                }
            }
        }
        System.out.println(intStack);
    }
}

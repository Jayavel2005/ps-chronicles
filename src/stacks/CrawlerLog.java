package stacks;

import java.util.Stack;

public class CrawlerLog {
    public static void main(String[] args) {
        String[] logs = {"d1/", "../", "../", "../"};

        Stack<String> stack = new Stack<>();
        for (String path : logs) {
            if (path.equals("./")) {

            } else if (path.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(path);
            }
        }

        System.out.println(stack.size());
    }
}

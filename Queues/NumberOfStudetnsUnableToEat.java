package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudetnsUnableToEat {
    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        Stack<Integer> sandwitch = new Stack<>();
        Queue<Integer> student = new LinkedList<>();

        for (int stu : students) {
            student.add(stu);
        }

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwitch.push(sandwiches[i])
            ;
        }
        int attempts = 0;
        while (!sandwitch.isEmpty() && !student.isEmpty()) {
            if (student.peek() == sandwitch.peek()){
                student.poll();
                sandwitch.pop();
                attempts = 0;
            }else {
                student.add(student.poll());
            }

            if (student.size() == sandwitch.size()){
                System.out.println(attempts);
                break;
            }
        }
    }
}

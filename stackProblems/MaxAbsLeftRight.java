import java.util.Scanner;
import java.util.Stack;

public class MaxAbsLeftRight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightstack = new Stack<>();

        // left
        for(int i = 0;i<arr.length;i++){
            boolean found = false;
            for(int j = i - 1;j>=0;j--){
                if (arr[j] < arr[i]) {
                    leftStack.push(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                leftStack.push(0);

            }
        }

        // right
        for(int i = 0;i<arr.length;i++){
            boolean found = false;
            for(int j = i + 1;j<arr.length;j++){
                if (arr[j] < arr[i] ) {
                    rightstack.push(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                rightstack.push(0);
            }
        }

        System.out.println(leftStack);
        System.out.println(rightstack);

        int max = Integer.MIN_VALUE;

        while (!leftStack.isEmpty() && !rightstack.isEmpty()) {
            int diff = Math.abs(leftStack.pop() - rightstack.pop());
            if (diff > max) {
                max = diff;
            }
        }

        System.out.println(max);
    }
}
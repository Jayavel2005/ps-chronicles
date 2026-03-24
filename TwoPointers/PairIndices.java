/*
Problem 2: Two Sum (Sorted Array)

Given a sorted array of integers,
return the indices (0-based) of two numbers such that they add up to target.

Input:
arr = [2, 3, 5, 9, 14]
target = 11

Output:
[0, 3]

Explanation:
arr[0] + arr[3] = 2 + 9 = 11
*/

import java.util.Scanner;

public class PairIndices {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Number of Elements: ");
        int n = in.nextInt();


        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Target: ");
        int target = in.nextInt();

        int left = 0;
        int right = arr.length - 1;

        in.close();

        while (left < right) {
            int sum = arr[right] + arr[left];

            if(sum == target){
                System.out.println("[" + left + ", " + right + "]");
                return;
            }else if(sum > target) right--;
            else left++;
        }
        System.out.println("[-1, -1]");

        
    }
}
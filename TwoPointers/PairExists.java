/*
Problem 1: Check if Pair Exists

Given a sorted array of integers and a target value,
return true if there exists a pair whose sum equals the target,
otherwise return false.

Input:
arr = [1, 4, 6, 8, 10]
target = 13

Output:
true

Explanation:
4 + 9 doesn't exist
6 + 7 doesn't exist
But 3rd combination:
? → find using two pointers
*/

import java.util.Scanner;

public class PairExists {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size of N: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Target: ");
        int target = in.nextInt();

        int left = 0;
        int right = arr.length - 1;

        boolean exists = false;

        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                exists = true;
                break;
            }
            else if (sum > target) {
                right--;
            }
            else {
                left++;
            }
        }
        System.out.println(exists ? "Present" : "Not present");
        in.close();
    }
}
/*
Problem 3: Count All Valid Pairs

Given a sorted array,
count how many pairs have sum equal to target.

Input:
arr = [1, 2, 3, 4, 5, 6]
target = 7

Output:
3

Explanation:
Pairs:
(1,6), (2,5), (3,4)
*/

import java.util.Scanner;

public class CountPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Target:  ");
        int target = in.nextInt();


        int left = 0;
        int right = arr.length - 1;

        int cnt = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                cnt++;
                left++;
                right--;
            }
            else if(sum > target) right--;
            else left++;
        }
        System.out.println(cnt);
        in.close();
    }
}
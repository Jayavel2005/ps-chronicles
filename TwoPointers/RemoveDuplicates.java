/*
Problem 4: Unique Pair Count (No Duplicate Pairs)

Given a sorted array (may contain duplicates),
count unique pairs that sum to target.

Input:
arr = [1, 1, 2, 2, 3, 4]
target = 5

Output:
2

Explanation:
Valid unique pairs:
(1,4), (2,3)
*/

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();
        

        int left = 0;
        int right = arr.length - 1;


        int cnt = 0;
        while(left < right){
            int sum = arr[left] + arr[right];

            if (sum == target) {
                cnt++;

                int leftValue = arr[left];
                int rightValue = arr[right];

                while (left < right && arr[left] == leftValue) left++;
                while (left < right && arr[right] == rightValue) right--;
            }
            else if (sum > target) right--;
            else left++;
        }

        System.out.println(cnt);
        in.close();

    }

    public static int removeDuplicates(int[] arr){
        int k = 0;
        for(int i = 1;i<arr.length;i++){
            if (arr[i] != arr[i - 1]) {
                arr[k++] = arr[i-1];
            }
            else continue;
        }
        arr[k++] = arr[arr.length - 1];

        

        return k;
        
    }
}
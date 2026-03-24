// package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Hash {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        int[] arr = {1,2,1,3,1};
        // for(int i = 0;i<n;i++){
        //     arr[i] = in.nextInt();
        // }

        // Set<Integer> set = new LinkedHashSet<>();
        // for(int i = 0;i<arr.length;i++){
        //     set.add(arr[i]);
        // }
        
        // for (int num : set) {
        //     System.out.println( num +  " " + freq(num, arr));
        // }

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : arr){
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else
                map.put(num, 1);
        }

        System.out.println(map);


    }

    // bf approach

    static int freq(int n, int[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if (n == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
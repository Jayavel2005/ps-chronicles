import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of Elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        

        in.close();
    }

    static void selectionSort(int[] arr){
        for(int i = 0;i<arr.length -1; i++){
            int min = i;
            for(int j = i + 1;j<arr.length;j++){
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
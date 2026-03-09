import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){
        for(int i = 0;i<arr.length - 1;i++){
            boolean swapped = false;
            for(int j = 0;j<arr.length - i - 1;j++){
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }
}
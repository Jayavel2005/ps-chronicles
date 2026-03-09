# Bubble Sort

Bubble Sort is one of the simplest sorting algorithms used to arrange elements in **ascending or descending order**.
It repeatedly compares **adjacent elements** and swaps them if they are in the wrong order.

The algorithm gets its name because **larger elements "bubble" toward the end of the array after each pass**.

---

# How Bubble Sort Works

Bubble Sort works by repeatedly stepping through the list and comparing adjacent elements.

If the current element is greater than the next element, they are swapped.

After every pass through the array, the **largest unsorted element moves to its correct position at the end**.

Example:

Initial array

```
5 1 4 2 8
```

Pass 1

```
5 1 → swap → 1 5 4 2 8
5 4 → swap → 1 4 5 2 8
5 2 → swap → 1 4 2 5 8
5 8 → no swap
```

Largest element **8** is now in its correct position.

---

# Key Idea

After the **k-th pass**, the **k largest elements are placed correctly at the end of the array**.

The unsorted part of the array keeps shrinking after every pass.

```
[ unsorted | sorted ]
```

---

# Java Implementation

```java
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

        in.close();
    }

    static void bubbleSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){

            boolean swapped = false;

            for(int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j + 1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if(swapped == false){
                break;
            }
        }
    }
}
```

---

# Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(n)       |
| Average Case | O(n²)      |
| Worst Case   | O(n²)      |

Best case occurs when the array is already sorted.
The `swapped` flag stops the algorithm early.

Worst case occurs when the array is **reverse sorted**.

---

# Space Complexity

```
O(1)
```

Bubble Sort sorts the array **in-place**, meaning it does not require extra memory.

---

# Advantages

Simple to understand and implement.

Useful for learning the basics of sorting algorithms.

Can stop early if the array becomes sorted.

---

# Disadvantages

Very slow for large datasets.

Time complexity is **O(n²)**, which makes it inefficient compared to modern algorithms like Merge Sort or Quick Sort.

---

# When Bubble Sort is Used

Bubble Sort is rarely used in production systems.
However, it is extremely useful for:

* Learning sorting fundamentals
* Understanding algorithm optimization
* Teaching algorithm design

---

# Summary

Bubble Sort repeatedly swaps adjacent elements until the array becomes sorted.

Key idea:

After each pass, the largest remaining element moves to its correct position at the end of the array.

Although inefficient for large datasets, it is one of the best algorithms for **learning how sorting works internally**.

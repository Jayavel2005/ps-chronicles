# Selection Sort

Selection Sort is a simple sorting algorithm that repeatedly **selects the smallest element** from the unsorted part of the array and places it at the beginning.

After each pass, the **smallest element moves to its correct position**.

---

# How It Works

1. Find the smallest element in the array.
2. Swap it with the first element.
3. Move to the next position.
4. Repeat the process for the remaining unsorted part.

Example:

Array:

```
5 3 1 4
```

Pass 1 (smallest = 1)

```
1 3 5 4
```

Pass 2 (smallest = 3)

```
1 3 5 4
```

Pass 3 (smallest = 4)

```
1 3 4 5
```

The array becomes sorted.

---

# Java Implementation

```java
static void selectionSort(int[] arr) {

    for(int i = 0; i < arr.length - 1; i++) {

        int minIndex = i;

        for(int j = i + 1; j < arr.length; j++) {

            if(arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
```

---

# Time Complexity

Best Case: `O(n²)`
Average Case: `O(n²)`
Worst Case: `O(n²)`

Selection Sort always scans the remaining array to find the smallest element.

---

# Space Complexity

`O(1)` (in-place sorting)

---

# Summary

Selection Sort repeatedly finds the smallest element from the unsorted part and places it at the beginning.

It is easy to understand but inefficient for large datasets.

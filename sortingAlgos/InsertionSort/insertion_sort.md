# Insertion Sort

Insertion Sort is a simple sorting algorithm that builds the sorted array **one element at a time**.

It works by taking each element and **inserting it into its correct position** in the already sorted part of the array.

---

# How It Works

1. Assume the first element is already sorted.
2. Take the next element.
3. Compare it with elements in the sorted part.
4. Shift larger elements to the right.
5. Insert the element in the correct position.

Example:

Array:

```
7 3 5 2
```

Step 1

```
7 | 3 5 2
```

Step 2 (insert 3)

```
3 7 | 5 2
```

Step 3 (insert 5)

```
3 5 7 | 2
```

Step 4 (insert 2)

```
2 3 5 7
```

The array becomes sorted.

---

# Java Implementation

```java
static void insertionSort(int[] arr) {

    for(int i = 1; i < arr.length; i++) {

        int key = arr[i];
        int j = i - 1;

        while(j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }
}
```

---

# Time Complexity

Best Case: `O(n)`
Average Case: `O(n²)`
Worst Case: `O(n²)`

Best case occurs when the array is already sorted.

---

# Space Complexity

`O(1)` (in-place sorting)

---

# Summary

Insertion Sort works by inserting elements into their correct position in a sorted portion of the array.
It is simple and efficient for **small or nearly sorted datasets**.

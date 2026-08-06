                                                                              ### What is an Array?
An array is a data structure that stores multiple values in a single variable. Each value has an index. 
Usually, indexing starts from 0.
```
arr = [10, 20, 30, 40, 50]
```
Index positions:
```
Index:  0   1   2   3   4
Value: 10  20  30  40  50
```
```
arr[0] = 10
arr[1] = 20
arr[4] = 50
```
## Basic Array Operations
### 1. Access:
```java
   int arr[]={1,2,4,5,6};
   System.out.print(arr[2]);
``` 
output: 4
Time complexity : O(1)
### 2.Update:
```java
int[] arr = {10, 20, 30};
arr[1] = 99;
System.out.println(Arrays.toString(arr));

```
output: [10,99,30]

### 3.Traversal

```java
int arr[]={2, 34,4,5};
for(int num:arr){
System.out.println(num);
}

```
Time complexity : O(n)
### 4. Search:
```java
public static int search(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }
    return -1;
}

```
Time complexity is O(n).

### 5.Insert
```java
ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(10,20,30));
arr.add(40);
```
### 6.Delete
```java
ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30));
arr.remove(arr.size() - 1);
```
## Array Operation Complexity Table
## Array Time Complexities

| Operation | Time Complexity |
|-----------|----------------|
| Access by index | O(1) |
| Update by index | O(1) |
| Traverse | O(n) |
| Search (unsorted array) | O(n) |
| Search (sorted array using binary search) | O(log n) |
| Insert at end | O(1) amortized |
| Insert at beginning/middle | O(n) |
| Delete from end | O(1) |
| Delete from beginning/middle | O(n) |

## Common Array Patterns
Most array problems are solved using patterns.
```java
1. Traversal
2. In-place modification
3. Two Pointers
4. Prefix Sum
5. Sliding Window
6. Hash Map Counting
7. Sorting
8. Greedy
9. Kadane's Algorithm
10. Binary Search
```
### Traversal
Visit each element of a data structure (array, list, tree, graph) in a defined order to read or process values. Used for searching, counting, building results, and as the base step in many algorithms.

### In-place modification
Transform the input using only constant extra space by modifying elements directly (e.g., reversing, removing duplicates, swapping). Saves memory and often improves performance when original input need not be preserved.

### Two Pointers
Use two indices moving through a sequence (same or opposite directions) to find pairs, partition, or reduce complexity from O(n^2) to O(n). Common for sorted arrays, linked lists, and window boundary management.

### Prefix Sum
Precompute cumulative sums in an array so range-sum queries and some condition checks become O(1) after O(n) preprocessing. Useful for subarray sums, difference techniques, and converting repeated sums into constant-time lookups.

### Sliding Window
Maintain a variable-size or fixed-size window over a sequence and update its value incrementally to solve subarray substring problems in O(n). Ideal for max/min sum, longest substring with constraints, and consecutive-range checks.

### Hash Map Counting
Use a hash map to count frequencies or store element-to-index mappings for O(1) average lookups. Enables quick detection of complements, duplicates, and frequency-based conditions.

### Sorting
Reorder elements by a defined order to simplify later operations (binary search, two-pointer, grouping). Sorting often changes complexity trade-offs but unlocks efficient patterns and deterministic outputs.

### Greedy
Build a solution step-by-step by choosing the locally optimal choice at each step, hoping to reach a global optimum. Fast and simple when problem has the greedy-choice property; otherwise requires proof or counterexamples.

### Kadane's Algorithm
Linear-time method to find the maximum subarray sum by tracking the best sum ending at the current position and the overall best. Extremely efficient for contiguous subarray maximum sum problems.

### Binary Search
Repeatedly halve a sorted search space to find a target or threshold in O(log n) time. Applicable on arrays, monotonic functions, and answer-space searches (parametric search).


##  How to Recognize a Problem is actually an array problem
```Find max/min,
Find duplicate,
Find missing number,
Move elements,
Remove elements in-place,
Rotate array ,
Find subarray,
Find pair,
Find product/sum,
Count frequency,
Find increasing sequence
```





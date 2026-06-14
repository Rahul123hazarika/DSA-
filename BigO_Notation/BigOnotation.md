# BigO Notation

Big O Notation is a way to describe the efficiency of an algorithm.It tells us how much time or memory an algorithm needs as the input size grows.If input size is n, Big O tells us how the algorithm behaves when n becomes very large.

## TIME COMPLEXITY

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
This loop runs n times , so time complexity is O(n).

## BigO ignores constant values 
```java
for(int i=0;i<n;i++){
    System.out.print(i);
}
for(int j=0;j<n;j++){
    System.out.println(j)
}
```
this above code runs 2n times, but BigO ignores constant values. so finalized time complexity will be from O(2n) --> O(n).

Here also same  :
 ```java
 for (int i = 0; i < n; i++) {
    System.out.println(i);
}

System.out.println("Done");
```
Here, the time complexity is the combination of linear time O(n) and constant time O(1), resulting in O(n + 1). Since Big-O notation ignores constant terms, the overall time complexity is O(n).

## Big-O growth order -
```
O(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(n^3) < O(2^n) < O(n!)

```

## Common Big-O complexities 
 
### O(1)- constant time: 
The algorithm takes the same amount of time regardless of input size.
```java
public static int getFirst(int[] arr) {
    return arr[0];
}
```
Even if the array has 10 elements or 10 million elements, we only access the first element. so time complexity is O(1) only.
### O(n) - Linear Time
The algorithm grows directly with input size.
```java
public static void printAll(int arr[]){
    for(int num:arr){
        System.out.print(num);
 }
}
```
If there are 10 elements, the loop runs 10 times or if there are 1,000 elements, the loop runs 1,000 times.So Time complexity is O(n).

### O(n²) - Quadratic Time
Usually happens when we use nested loops.
```java
public static void printPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i] + " " + arr[j]);
        }
    }
}
```
If n = 100, total operations are:
100 × 100 = 10,000, then time complexity is O(n^2)

### O(log n) - Logarithmic Time
Usually happens when the input size is divided by 2 again and again.
```java
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }

    return -1;
}

```
Every step removes half of the array.so time Complexity:O(log n). Usually this happens in efficient sorting algorithms.so time complexity is O(log n).
### O(n log n)
Usually found in efficient sorting algorithms.
Examples:
Merge Sort
Heap Sort
Quick Sort average case

Because:
We divide the array repeatedly: log n
At each level, we process n elements.
so the time complexity is O(n log n).

### O(2ⁿ) - Exponential Time
Usually happens in recursive problems where each call creates two more calls.
```java
public static int fibonacci(int n) {
    if (n <= 1) return n;

    return fibonacci(n - 1) + fibonacci(n - 2);
}
```
This creates many repeated calls. so it's time complexity is O(2ⁿ).

| Complexity | Meaning             | Operations (n = 10) |
|------------|---------------------|---------------------|
| O(1)       | Constant            | 1                   |
| O(log n)   | Divide & conquer    | ~3                  |
| O(n)       | Linear              | 10                  |
| O(n log n) | Efficient sorting   | ~30                 |
| O(n²)      | Nested loops        | 100                 |
| O(2ⁿ)      | Exponential         | 1024                |
| O(n!)      | Factorial           | 3,628,800           |

## SPACE COMPLEXITY
### O(1) Space:
```java
public class Main
{   public static int sumarray(int arr[]){
    int total=0;
    for(int i : arr){
        
        total+=i;
    }
    return total;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5};
		System.out.println("sum of the array is "+ sumarray(arr));
	}
}

```
We only use one extra variable: the variable is total.So the space complexity is O(1).

### O(n) Space:
```java
public static int[] copyArray(int[] arr) {
    List<Integer> result = new ArrayList<>();

    for (int num : arr) {
        result.add(num);
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
}
```
We create a new array of size n
so space complexity for this is  O(n).

### O(n²) Space
```java
public static int[][] createMatrix(int n) {
    int[][] matrix = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = 0;
        }
    }

    return matrix;
}
```
We create an n × n matrix.so space complexity is O(n²)
## Best, Worst, and Average Case

### Best Case
The minimum time an algorithm can take.
```java
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }

    return -1;
}
```
If the target is at the first index:
Best Case = O(1)

### Worst Case
The maximum time an algorithm can take.
In linear search, if the target is at the end or not present:
Worst Case = O(n)

### Average Case
The expected time for a normal input.
In linear search, the target may be somewhere in the middle.
O(n)

## What is the difference between Big O, Big Theta, and Big Omega?
Big O (O) describes the upper bound - the worst-case growth rate.
Big Omega (Ω) describes the lower bound - the best-case growth rate.
Big Theta (Θ) describes the tight bound, meaning the algorithm's growth rate is bounded both above and below by the same function.
In practice, Big O is most commonly used because we typically care about worst-case performance guarantees.


## Amortized Analysis
Amortized analysis means calculating the average cost of operations over time.
Some operations are usually cheap, but occasionally expensive.
A common example is dynamic arrays.
In Python, list.append() is usually:
Output
O(1)
But sometimes, when the internal array is full, Python creates a bigger array and copies all elements.

That one operation may take:

Output
O(n)
But this expensive operation does not happen every time.
So over many append operations, the average cost is still:
Output
O(1) amortized
Simple Example

Imagine a bus.
Most of the time, adding one passenger is quick.
But sometimes, the bus becomes full and we need a bigger bus.

Moving everyone to a bigger bus is expensive.

But because it happens rarely, the average cost per passenger is still small.

That is amortized analysis.

###  Recurrence Relations
Recurrence relations are used to describe recursive algorithms.
A recurrence tells us how the time of a problem depends on smaller subproblems.
```java
public static int[] mergeSort(int[] arr) {
    if (arr.length <= 1) return arr;

    int mid = arr.length / 2;

    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left, right);
}
```
Merge Sort divides the array into two halves.
Then it merges them in linear time.
The recurrence is:
T(n) = 2T(n/2) + O(n)
Meaning:2T(n/2),We solve two subproblems of size n/2.
O(n),We merge the results.
Final complexity:
O(n log n)

## Master Theorem
Master Theorem is a shortcut to solve recurrence relations.It is useful for divide-and-conquer algorithms.
General form:
```
T(n) = aT(n/b) + O(n^d)
```
where
a = number of subproblems,
b = factor by which input size is divided,
d = power of work done outside recursion
Ex:
Binary Search recurrence:
```
T(n) = T(n/2) + O(1)
```
here
a = 1,
b = 2,
d = 0,
so complexity is O(log n).

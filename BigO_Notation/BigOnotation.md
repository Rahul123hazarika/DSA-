# BigO Notation

Big O Notation is a way to describe the efficiency of an algorithm.It tells us how much time or memory an algorithm needs as the input size grows.If input size is n, Big O tells us how the algorithm behaves when n becomes very large.

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







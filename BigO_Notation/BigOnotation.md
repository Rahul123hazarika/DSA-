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


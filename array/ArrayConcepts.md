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






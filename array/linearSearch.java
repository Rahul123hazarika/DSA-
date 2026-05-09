public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;  // return index if found
        }
    }
    return -1;  // not found
}

/
int[] arr = {4, 7, 1, 9, 3};
int idx = linearSearch(arr, 9);
System.out.println(idx);  

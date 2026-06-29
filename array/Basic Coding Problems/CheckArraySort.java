class CheckArraySort {
    // Method to check if array is sorted in ascending order
    public static boolean isSorted(int arr[]) {
        // Handle edge cases
        if (arr == null || arr.length <= 1) {
            return true;  // Empty or single element is always sorted
        }
        
        // Check each adjacent pair
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;  // Found unsorted pair
            }
        }
        return true;  // All pairs are sorted
    }
    
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 4, 2, 3, 6, 5};
        int arr3[] = {1, 2, 2, 3, 4};  // Equal values allowed
        
        System.out.println("arr1 sorted? " + isSorted(arr1));  // true
        System.out.println("arr2 sorted? " + isSorted(arr2));  // false
        System.out.println("arr3 sorted? " + isSorted(arr3));  // true
    }
}

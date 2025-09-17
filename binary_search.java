/* important note :
For using Arrays.sort() , we have to import java.util.Arrays or java.util.*  
 Arrays.sort(a);  // wee need to sort the array elements when elements are in unsorted order, because binary sort can only work with a sorted array
 . If the array is already sorted, the time complexity is O(log n), since here we did sorting and searching both, so the  time complexity is O(n log n log n)
 . Since it's not a good time complexity compared to this, whenever we get an unsorted array, we generally do a linear search, O(n).
*/

class Searching {
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        return -1; // make sure return statement is outside loop
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 6, 5, 2, 9, 10};
        Arrays.sort(a);  // wee need to short the array elements when elements are in unsorted order , because binary sort can only work with sorted array.
        int key = 2;
        System.out.println(binarySearch(a, key));
    }
}

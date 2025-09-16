//Step 1: Arrays & Searching
//linear search
class lin {
    static int search(int arr[], int numberof_element, int searching_element) {
        for (int i = 0; i < numberof_element; i++) {
            if (arr[i] == searching_element) {
                System.out.println("element found at index " + i);
                return i;   // return index when found
            }
        }
        // moved outside the loop
        System.out.println("element not found");
        return -1;  // return -1 only after checking all elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 7, 34};
        int n = arr.length;
        int x = 7;
        int index = search(arr, n, x);
        if (index != -1) {
            System.out.println("element found at index " + index);
        } else {
            System.out.println("element not found");
        }
    }
}

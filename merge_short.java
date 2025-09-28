class MergeSortDC {

    int[] temp = new int[100]; // temporary array (you can also create inside conquer)

    // Divide function
    void divide(int arr[], int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;

            // Divide
            divide(arr, lb, mid);
            divide(arr, mid + 1, ub);

            // Conquer (merge step)
            conquer(arr, lb, mid, ub);
        }
    }

    // Conquer (Merge two sorted halves)
    void conquer(int arr[], int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;

        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ub) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back to arr
        for (int x = lb; x <= ub; x++) {
            arr[x] = temp[x];
        }
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;

        MergeSortDC ms = new MergeSortDC();
        ms.divide(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

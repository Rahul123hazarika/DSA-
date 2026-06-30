// remove a desired element from an array
import java.util.Scanner;
import java.util.Arrays;

class remove_element {
    // This method shifts valid elements to the front and returns the new length
    public static int remove(int arr[], int val) {
        int index = 0; // Pointer for the next valid element position
        
        for (int i = 0; i < arr.length; i++) {
            // If the current element is NOT the one to remove, keep it
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        // Return the new size of the array
        return index; 
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Enter the number you want to remove:");
        int val = sc.nextInt();
        
        int newLength = remove(arr, val);
        
        // Print the modified array up to the new length
        System.out.print("The finalized array is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

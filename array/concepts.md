  ARRAY USING JAVA:
An array is a linear data structure where all elements are arranged sequentially. It is a collection of elements of the same data type stored at contiguous memory locations


        NOTE-1: It stores elements of the same data type
        NOTE-2: Stored at a contiguous memory location.

Basic Terminologies of Array:
     Array Element: Elements are items stored in an array.
     Array Index: Elements are accessed by their indexes. Indexes in most programming languages start from 0.

Declaration of Array:


             // This array will store integer-type elements
              int arr[];    
            // This array will store char-type elements
             char arr[];   
           // This array will store float-type elements
             float arr[];



Initialization of Array:


       int arr[] = { 1, 2, 3, 4, 5 };
       char arr[] = { 'a', 'b', 'c', 'd', 'e' };
       float arr[] = { 1.4f, 2.0f, 24f, 5.0f, 0.0f };

TYPES OF ARRAY:
    1) Fixed size: We cannot alter or update the size of this array


        // Fixed sized array examples
            int[] arr1 = new int [5];
       // Another way 
       // initialization 
          int[] arr2 = {1, 2, 3, 4, 5};

2)Dynamic size: The size of the array changes as per user requirements during execution of code so the coders do not have to worry about sizes. They can add and removed the elements as per the need.


                 // Dynamic Integer Array
               ArrayList<Integer> arr = new ArrayList<>();



Types of Arrays on the basis of Dimensions:
1. One-dimensional Array(1-D Array): You can imagine a 1d array as a row, where elements are stored one after another.
     
       public class OneDArrayExample {
           public static void main(String[] args) {
             int[] arr = {10, 20, 30, 40, 50};  // Declaration and initialization

        System.out.println("Elements of 1D Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
           }
         }
       }



2. Two-Dimensional Array(2-D Array): A 2-D  array contains 2 dimensions, so it can be considered an array of two-dimensional arrays
      
        public class TwoDArrayExample {
             public static void main(String[] args) {
                int[][] matrix = {
                   {1, 2, 3},
                   {4, 5, 6},
                  {7, 8, 9}
        };

        System.out.println("Elements of 2D Array:");
        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line for each row
          }
         }
       }






   



        



        


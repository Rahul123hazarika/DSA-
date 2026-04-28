// here you will get different array-related basic and imp exercise .
// basic array example 
 class array {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

// find largest element in array
class largestElement{
    public static void main(String[] args){
        int arr[]={1, 4 , 2 ,3 ,5};
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

//trace of a matrix(trace means sum of diagonal elements, here matrix should be square matrix , means 2X2 , 3X3 where column and rows are equal)
class traceOfMatrix{
    public static void main(String args[]){
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int trace=0;
        for(int i=0; i<matrix.length;i++){
            trace+=matrix[i][i];

        }
        System.out.println("trace of this matrix is "+trace);
        
    }
}

//jagged array
class jaggedArray{
    public static void main(String[] args){
        int array[][]=new int[3][];
        //now assigning column size for all row 
        array[0]=new int[2];
        array[1]=new int[4];
        array[2]=new int[3];
        // assigning values using nested loops
        int count=1;
        for(int i=0;i<array.length; i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=count++;
            }
        }
        //printing values
        System.out.println("jagged array is ");
        for(int i=0;i<array.length; i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }   

    }
}
//in java array has by default values
 class ArrayDefaults {
    public static void main(String[] args) {
        
        // We only define the size, not the values
        int[] intArr = new int[3];
        boolean[] boolArr = new boolean[3];
        String[] strArr = new String[3];

        System.out.println("Default int: " + intArr[0]);     // Output: 0
        System.out.println("Default boolean: " + boolArr[0]); // Output: false
        System.out.println("Default String: " + strArr[0]);  // Output: null
    }
}
 // here you will get different array-related basic and imp exercise .
// basic array example 
 class array {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

// find largest element in array
class largestElement{
    public static void main(String[] args){
        int arr[]={1, 4 , 2 ,3 ,5};
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

//trace of a matrix(trace means sum of diagonal elements, here matrix should be square matrix , means 2X2 , 3X3 where column and rows are equal)
class traceOfMatrix{
    public static void main(String args[]){
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int trace=0;
        for(int i=0; i<matrix.length;i++){
            trace+=matrix[i][i];

        }
        System.out.println("trace of this matrix is "+trace);
        
    }
}

//jagged array
class jaggedArray{
    public static void main(String[] args){
        int array[][]=new int[3][];
        //now assigning column size for all row 
        array[0]=new int[2];
        array[1]=new int[4];
        array[2]=new int[3];
        // assigning values using nested loops
        int count=1;
        for(int i=0;i<array.length; i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=count++;
            }
        }
        //printing values
        System.out.println("jagged array is ");
        for(int i=0;i<array.length; i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }   

    }
}
//in java array has by default values
 class ArrayDefaults {
    public static void main(String[] args) {
        
        // We only define the size, not the values
        int[] intArr = new int[3];
        boolean[] boolArr = new boolean[3];
        String[] strArr = new String[3];

        System.out.println("Default int: " + intArr[0]);     // Output: 0
        System.out.println("Default boolean: " + boolArr[0]); // Output: false
        System.out.println("Default String: " + strArr[0]);  // Output: null
    }
}
 

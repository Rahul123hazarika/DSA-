 import java.util.Scanner;
 class insertAtAnyPosition {
    //In Java, arrays have a fixed size, so inserting a new element requires creating a new array and shifting the existing elements.    public static void main(String args[]){
    public static void main(String args[]){
        int arr[]={1,2,4,3,6,5};
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your index number where you insert the element");
        int index=sc.nextInt();
        System.out.println("Enter the number to insert");
        int number=sc.nextInt();
        //// Create new array of size +1
        int newArray[]=new int[arr.length+1];
        // trying to copy elements before the index value
        for(int i=0;i<index;i++){
            newArray[i]=arr[i];
        }
        // inserting new element 
        newArray[index]=number;
        // copying remaining elements
        for(int i=index; i<arr.length;i++){
            newArray[i+1]=arr[i];
        }
        //printing result 
        System.out.println("array after inserting new element");
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i] +" ");
        }

    }
}


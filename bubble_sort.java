import java.util.*;
class Sorting{
    //static int[] means it will return array type. 
    static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


    }

    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(); // taking total number of elements
        int arr[]=new int[n]; //storing size to the array
        for(int i=0;i<arr.length; i++){
            arr[i]=Sc.nextInt();
        }
        bubbleSort(arr);   
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}

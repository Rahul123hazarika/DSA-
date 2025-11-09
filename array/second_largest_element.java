//QUESTION : Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.


import java.util.Arrays;
class count{
    static int secondlargest(int arr[]){
        //first do sorting in ascending order
        Arrays.sort(arr);
        //count array length
        int n=arr.length;
        //since we already sorted the array , so second last element will be second largest element
        for(int i=n-2; i>=0; i--){
            // case1: if last element is not equal to second last then return second last one is the second largest element.
            if(arr[i]!=arr[n-1]){
                return arr[i]; 
            }


        }
        // If no second largest element was found, return -1
        return -1;
    }
    public static void main(String args[]){
        int arr[]={120, 305, 100, 10, 3004, 671};
        System.out.print(secondlargest(arr));
    }
}

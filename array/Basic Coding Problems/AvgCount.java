// Given an unsorted array arr[], the task is to find the mean of the array.
class avgnumber{
    static double avgOfNumbers(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
           
        }
        double avg=(double)sum/arr.length;
        return avg;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        double average=avgOfNumbers(arr);
        System.out.println("avg of this numbers "+average);
        
    }
}

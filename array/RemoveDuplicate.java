// remove duplicate elements from an array 
class RemoveDuplicate{
    public static int remove(int arr[]){
        int k=1;
        int n=arr.length;
        for(int i=1;i<=n-1;i++){
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }

        }
        return k;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,4,5,5,5,6,7,7};
        int j=remove(arr);

        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class insertion{
    void sort(int arr[]){
        int n=arr.length;
        for(int i=1; i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--; 
            }
            arr[j+1]=temp;
        }
    } 
    public static void main(String []args){
        int arr[]={1, 3 ,2, 6 , 5};
        insertion s= new insertion();
        s.sort(arr);
       for (int x : arr) {
        System.out.print(x + " ");
        }
    }
}

class FindMissing {
    static int findMissing(int arr[]){
        int n=arr.length+1;
        int expected=n*(n+1)/2;
        int actual=0;
        for(int num:arr){
            actual+=num;
        }
        return expected-actual;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        System.out.println(findMissing(arr));
}
}

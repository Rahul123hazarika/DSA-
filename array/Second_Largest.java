//find out second largest element of an array.
class Main {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,8,10};
        int largest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                largest=num;
            }
        }
        int Second_largest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>Second_largest && num!=largest){
                Second_largest=num;
            }
            
        }
        if(Second_largest==Integer.MIN_VALUE ){
            System.out.println(-1);
        }
        else{
            System.out.println(Second_largest);
        }
    }
}

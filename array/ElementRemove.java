import java.util.Scanner;
class ElementRemove{
    public static int removeElement(int nums[], int val){
        int k=0;
        for(int num:nums){
            if(num!=val){
                nums[k]=num;
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your element which one you want to remove");
        int val=sc.nextInt();
        
        // array after removal
        int k=removeElement(nums, val);
        System.out.println("new array length " +k);
        // array after removal
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();

    }
}

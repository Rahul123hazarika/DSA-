import java.util.Scanner;

class deleteAtanyPosition{
    public static void main(String []args){
          int arr[]={1,2,3,4,5,6};
          System.out.println("enter index to delete element");
          Scanner sc=new Scanner(System.in);
          int index=sc.nextInt();
          int newArray[]= new int[arr.length-1];
        //   copy element before index
        for(int i=0;i<index;i++){
            newArray[i]=arr[i];
        }
        //copy element after the index
        for(int i=index+1;i<arr.length; i++){
            newArray[i-1]=arr[i];
        }
        //print newArray
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]);  
        }
       }
}



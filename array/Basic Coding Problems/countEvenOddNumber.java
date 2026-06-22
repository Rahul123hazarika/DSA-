// You are given an array arr[]. Your task is to count the number of even and odd elements. Return first odd count then even count.
public class Main 
{   static int[] countOddEven(int arr[]){
    

    int oddcount=0;
    int evencount=0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]%2==0){
           evencount++;
       }
       else{
           oddcount++;
       }
      
      
     }
      int totalcount[]={oddcount, evencount};
      return totalcount;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5};
	    int result[]=countOddEven(arr);
	    System.out.print("total odd count "+result[0]+" ,"+"total evencount "+ result[1]);
	    
	    
	    
	}
	
}

// enter a number to print multiplication table of that number
import java.util.Scanner;
class Multiplication_table{
    
    public static void main(String args[]){
        
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for your number table");
        int n=sc.nextInt();
        
        for(int i=1;i<=10; i++){
            
          System.out.println(n + " * " + i +
                               " = " + n * i);
          
        }
      
      
    }
}

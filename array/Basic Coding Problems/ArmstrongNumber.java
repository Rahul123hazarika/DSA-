// check the number is armstrong number or not ?
// An Armstrong number (also called a narcissistic number) is a number that equals the sum of its own digits,where each digit is raised to the power of the total number of digits
import java.util.Scanner;
class ArmstrongNumber{
    public static boolean isArmstrong(int num){
        int originalNumber=num;
        int sum=0;
        int digit=String.valueOf(num).length();
        while(num!=0){
            int x=num%10;
            sum +=Math.pow(x, digit);
            num=num/10;
        }
        return sum==originalNumber;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("the number is an armstrong number");
        }
        else{
            System.out.println("number is not an armstrong number");
        }
        sc.close();
    }
    
}

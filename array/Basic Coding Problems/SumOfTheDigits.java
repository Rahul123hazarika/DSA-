// sum of digits of a number
class SumOfTheDigits{
    
    public static void main(String args[]){
      int n=1234;
      int sum=0;
      while(n!=0){
          int num=n%10;
          sum=sum+num;
          n=n/10;  
      }
      System.out.print("sum of all digits "+sum);
    }
}

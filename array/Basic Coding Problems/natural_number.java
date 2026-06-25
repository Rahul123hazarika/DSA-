// Difference between sum of the squares of first n natural numbers and square of sum
class natural_number{
    static int find(int n){
        int sumofSquares=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            sumofSquares+=Math.pow(i,2);
            sum+=i;
        }
        int squareofSum=(int)Math.pow(sum,2);
        int difference=Math.abs(sumofSquares-squareofSum);
        return difference;
    }
    public static void main(String args[]){
        int n=3;
        System.out.print("so the difference here is "+find(n));
    }
}

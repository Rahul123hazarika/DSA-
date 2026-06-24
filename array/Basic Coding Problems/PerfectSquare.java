// Check if given number is perfect square
class PerfectSquare {
    public static boolean isPerfectSquare(long n) {
        // Edge case: Negative numbers cannot be perfect squares
        if (n < 0) return false; 
        
        long x = (long) Math.sqrt(n);
        
        // Secondary safety check to prevent overflow issues on massive values
        return x * x == n;
    } 

    public static void main(String args[]) {
        long n = 50;
        
        if (isPerfectSquare(n)) {
            long x = (long) Math.sqrt(n);
            System.out.println("Yes, the square root of " + n + " is " + x);
        } else {
            System.out.println(n + " is not a perfect square.");
        }
    }
}

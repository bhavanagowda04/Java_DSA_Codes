public class Recursion3{
    public static void fibnoacci(int a, int b, int n){
        if (n == 0) {
            return;
        }
         int c = a + b; // Calculate the next Fibonacci number
         System.out.println(c); // Print the next number
         fibnoacci(b, c, n-1); // Print the next number
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1; // First number in the Fibonacci sequence
        System.out.println(a) ;
        System.out.println(b) ; // Print the first two numbers
        int n = 7; // Number of terms to print
        fibnoacci(a, b, n - 2); // Call the recursive function to print the rest
    }
    
} 


public class Recursion_factorial{
    public static int calcfactorial(int n){
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        int fact_nm1 = calcfactorial(n - 1); // Recursive call
        int fact_n = n * fact_nm1; // Calculate factorial of n
        return fact_n; // Return the result

    }
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = calcfactorial(n); // Call the recursive function
        System.out.println("Factorial of " + n + " is: " + result); // Output the result
    }
} 

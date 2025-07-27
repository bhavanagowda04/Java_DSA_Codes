public class Recursion4{
    public static int calcpower (int x, int n){
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcpower(x, n / 2) * calcpower(x, n / 2);
        } else {
            return calcpower(x, n / 2) * calcpower(x, n / 2) * x;
        }
    }
    public static void main(String args[]) {
        int x = 2;
        int n = 5; // First number in the Fibonacci sequence
        int ans = calcpower(x, n); // Number of terms to print
        System.out.println(ans); // Print the result
    }
    
} 

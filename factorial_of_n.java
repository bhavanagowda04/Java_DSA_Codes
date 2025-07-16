//import java.util.*;

public class factorial_of_n {
    public static void printfactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i=0; i<n; i++){
            factorial = factorial * (i+1);
        }

        System.out.println("The factorial of " + n + " is: " + factorial);
    }
    public static void main(String args[]){
       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = sc.nextInt();*/
        int n = 4; // Example value, you can change this to test different inputs
        printfactorial(n);
    }
}
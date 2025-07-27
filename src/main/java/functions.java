//import java.util.*;

public class functions {
    public static int calculateSum(int a,int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);*/
        int a = 3; // Example value, you can change this to test different inputs
        int b = 4; // Example value, you can change this to test different inputs
        int sum = calculateSum(a, b);
        System.out.println("The sum is: " + sum);
    }
}
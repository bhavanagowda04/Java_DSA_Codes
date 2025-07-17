//import java.util.*;

public class sum_of_natural_numbers {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt(); 
        int n = 5; // Example number, you can change this value to test different inputs
        int sum = 0;
        for(int i = 1; i <= n; i++) {
           sum = sum + i;
        }
        System.out.println(sum);

    }
}
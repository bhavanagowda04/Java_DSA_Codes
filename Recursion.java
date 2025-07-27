public class Recursion{
    // public static void printnum(int n){
    //     if (n == 6) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printnum(n + 1);    
    // }
    // public static void main(String[] args) {
    //     int n = 1;
    //     printnum(n);
    // }
    public static void printsumofn(int i, int n, int sum){
        if (i == n){
            sum += i;
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
            return;
        } 
            sum += i;
            printsumofn(i + 1, n, sum);
        
    }
        
    
    public static void main(String[] args) {
        printsumofn(1, 5,0);
    }
} 
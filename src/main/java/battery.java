import java.util.*;

public class battery{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter system batter charge:");
        // Read two integers from the user
       int a = sc.nextInt();

       System.out.println("Enter battery to charge:");
       int b = sc.nextInt();
       

        if( a + b == 100 ){
            System.out.println("Stop charging, battery is full");
        } else if( a + b > 100 ){
            System.out.println("Battery overflow: " + (a + b - 100) + "% over the limit");
        }
        else {
            System.out.println("Battery is charging, current charge: " + (a + b) + "%");
        }
        }
 }

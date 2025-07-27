//import java.util.*;

public class BuzzFuzz2{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //int button = sc.nextInt();
        int a = 1; 
        int b = 5; // Fuzz
        int c = 3; // Buzz
        for (int i = 1; a <= 15; a++) {
        switch(a) {
            // case 1: System.out.println("BuzzFuzz" + a % b  a % c);
            //         break;
            case 2: System.out.println("Fuzz" + a % b );
                    break;  
            case 3: System.out.println("Buzz" + a % c);
                    break;
            default: System.out.println("Invalid");
        }
}
     
        }
 }

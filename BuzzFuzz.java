
public class BuzzFuzz{
    public static void main(String[] args){
    //    Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter a number: ");
       float a = 1;
       float b = 5;
       float c = 3;
       
    //    int a = 20; // Example number, you can change this value to test different conditions
    //    int b = 10; // Example number, you can change this value to test different conditions
    for(int i = 1; a <= 15; a++){
        if( a % c == 0 && a % b == 0 ){
            System.out.println("BuzzFuzz");
        } else if( a % b == 0 ){
            System.out.println("Fuzz");
        }
        else if( a % c == 0 ){
            System.out.println("Buzz");
        }
        else{
            System.out.println(a);
        }
        }
    }
 }

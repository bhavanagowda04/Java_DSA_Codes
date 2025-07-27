 public class Loops{
    public static void main(String[] args){
        //for(int counter = 0; counter < 11; counter = counter + 1){
        for(int i = 0; i < 5; i++){
            System.out.println("hello world");
        }

        // While loop example with a condition
        int sum = 0;
        while(sum < 3){
            System.out.println(sum);
            sum = sum + 1;
        }

        // do-while loop example
        int x = 0;
        do { 
            System.out.println(x);
            x = x + 1;
        } while (x < 5);
        
    }
 }
//import java.util.*;

public class Array_LinearSearch {
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        int size = 5; 
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
           // numbers[i] = sc.nextInt();
           numbers[i] = i + 1; 
        }

        //int x = sc.nextInt();
        int x = 3; 

        for (int i=0; i<size; i++){
            if(numbers[i] == x){
                System.out.println("x found at index: " + i);
            }
        }
    }
}
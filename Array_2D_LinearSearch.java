//import java.util.*;

public class Array_2D_LinearSearch {
    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
        //int rows = sc.nextInt();
        //int col = sc.nextInt();
        int rows = 2;
        int col = 4;

        int numbers[][] = new int[rows][col];

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                //numbers[i][j] = sc.nextInt();
                numbers[i][j] = i + j; 
            }
        }

        //int x = sc.nextInt();
        int x = 2;

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(numbers[i][j] == x){
                    System.out.println("Found at: " + i + " " + j);
                }
            }
        }
        
    }
}
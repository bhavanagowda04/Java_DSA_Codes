//import java.util.*;

public class Array_2D {
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
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

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
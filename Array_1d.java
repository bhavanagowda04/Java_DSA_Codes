
public class Array_1d{
    public static void main(String args[]){
        int [] marks = new int[3]; // Declare an array of size 3
        marks[0] = 97; // Assign value to the first element
        marks[1] = 98; // Assign value to the second element    
        marks[2] = 99; // Assign value to the third element
       // System.out.println(marks[0]); 
       // System.out.println(marks[1]);  
       // System.out.println(marks[2]); 

       for(int i = 0; i<3; i++ ){
              System.out.println(marks[i]); // Print each element of the array
       }
    }
}
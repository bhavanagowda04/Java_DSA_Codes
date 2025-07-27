public class Strings{
    public static void main(String args[]){
        //concatenation of two strings
        String firstName = "Bhavana";
        String lastName = "Gowda";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        //length of the string
        System.out.println("The length of the full name is: " + fullName.length());
         //CharAt method
    for(int i = 0; i < fullName.length(); i++){
        System.out.println("Character at index " + i + ": " + fullName.charAt(i));
    } 
    
   
    }
}
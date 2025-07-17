public class Strings_compare{
    public static void main(String args[]){
        //concatenation of two strings
        String name1 = "Bhavana";
        String name2 = "Bhavanagowda";
       if(name1.compareTo(name2) == 0){
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        }

        //substring example
        String sentence = "My name is Bhavana";
        //substring (beginIndex, endIndex)
        String name = sentence.substring(11,sentence.length()); // Extracts "welcome"
        System.out.println("Extracted name: " + name);
        
       
    } 
    
   
    }

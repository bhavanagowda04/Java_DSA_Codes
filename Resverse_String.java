public class Resverse_String{
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("Hello");

        for(int i = 0; i < str.length() / 2; i++){
            int front = i;
            int back = str.length() - i - 1;
            //swap characters
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt( back, frontChar);
        }
        System.out.println("Reversed String: " + str);

    }
}
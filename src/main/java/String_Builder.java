public class String_Builder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println("Initial StringBuilder: " + sb);

        //CharAT index 0
        System.out.println("Character at index 1: " + sb.charAt(0));

        //set Char at index 0
        sb.setCharAt(0, 'R');
        System.out.println("After setting character at index 0: " + sb);

        //set insert at index 0
        sb.insert(2, 'n');
        System.out.println("After inserting 'A' at index 0: " + sb);

        //delete
        sb.delete(2, 4);
        System.out.println("After deleting characters from index 0 to 2: " + sb);

        //append
        sb.append("H");
        sb.append("i");
        System.out.println("After appending: " + sb);
    }
}
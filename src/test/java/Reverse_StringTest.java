// File: Resverse_StringTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Resverse_StringTest {

    // Copying the logic here to mimic the behavior of your main method
    private String reverse(String input) {
        StringBuilder str = new StringBuilder(input);

        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - i - 1;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }

        return str.toString();
    }

    @Test
    public void testReverseHello() {
        assertEquals("olleH", reverse("Hello"));
    }

    @Test
    public void testReverseEmpty() {
        assertEquals("", reverse(""));
    }

    @Test
    public void testReverseSingleChar() {
        assertEquals("A", reverse("A"));
    }

    @Test
    public void testReverseSpaces() {
        assertEquals(" dlroW", reverse("World "));
    }

    @Test
    public void testPalindrome() {
        assertEquals("madam", reverse("madam"));
    }
}


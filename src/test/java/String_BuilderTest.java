// File: String_BuilderTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class String_BuilderTest {

    @Test
    public void testStringBuilderOperations() {
        StringBuilder sb = new StringBuilder("Tony");

        // Step 1: Check initial char at index 0
        assertEquals('T', sb.charAt(0));

        // Step 2: setCharAt
        sb.setCharAt(0, 'R');
        assertEquals("Rony", sb.toString());

        // Step 3: insert at index 2
        sb.insert(2, 'n');  // Result: "Ronny"
        assertEquals("Ronny", sb.toString());

        // Step 4: delete from index 2 to 4 (deletes 'nn')
        sb.delete(2, 4);  // Result: "Roy"
        assertEquals("Roy", sb.toString());

        // Step 5: append H and i
        sb.append("H");
        sb.append("i");  // Result: "RoyHi"
        assertEquals("RoyHi", sb.toString());
    }
}

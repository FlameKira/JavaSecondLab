package fourth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OddEvenSeparatorTest {

    @Test
    void testEvenAndOdd() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        assertEquals("2 ", separator.even());
        assertEquals("1 3 ", separator.odd());
    }
}
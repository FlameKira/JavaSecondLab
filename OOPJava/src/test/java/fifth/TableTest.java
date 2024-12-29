package fifth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void testSetValueAndGetValue() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 5);
        assertEquals(5, table.getValue(0, 0));
    }

    @Test
    void testAverage() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);
        assertEquals(2.5, table.average());
    }

    @Test
    void testToString() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);
        assertEquals("1 2 \n3 4 \n", table.toString());
    }
}
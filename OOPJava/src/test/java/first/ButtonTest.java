package first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {

    @Test
    void testClick() {
        Button button = new Button();
        assertEquals(button.click(), "Количество нажатий: 1");
        assertEquals(button.click(), "Количество нажатий: 2");
    }
}
package sixth.geometry2d;

import sixth.exceptions.InvalidDimensionException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea() throws InvalidDimensionException {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.area());
    }

    @Test
    void testPerimeter() throws InvalidDimensionException {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.perimeter());
    }

    @Test
    void testInvalidDimensions() {
        assertThrows(InvalidDimensionException.class, () -> new Rectangle(0, 5));
        assertThrows(InvalidDimensionException.class, () -> new Rectangle(4, 0));
        assertThrows(InvalidDimensionException.class, () -> new Rectangle(-1, 5));
        assertThrows(InvalidDimensionException.class, () -> new Rectangle(4, -1));
    }
}
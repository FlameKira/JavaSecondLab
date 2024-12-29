package sixth.geometry2d;

import sixth.exceptions.InvalidRadiusException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testArea() throws InvalidRadiusException {
        Circle circle = new Circle(5);
        assertEquals(Math.PI * 25, circle.area());
    }

    @Test
    void testPerimeter() throws InvalidRadiusException {
        Circle circle = new Circle(5);
        assertEquals(2 * Math.PI * 5, circle.perimeter());
    }

    @Test
    void testInvalidRadius() {
        assertThrows(InvalidRadiusException.class, () -> new Circle(0));
        assertThrows(InvalidRadiusException.class, () -> new Circle(-1));
    }
}
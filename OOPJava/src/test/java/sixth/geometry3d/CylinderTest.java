package sixth.geometry3d;

import sixth.exceptions.InvalidDimensionException;
import sixth.exceptions.InvalidRadiusException;
import sixth.geometry2d.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void testVolume() throws InvalidDimensionException, InvalidRadiusException {
        Circle base = new Circle(5);
        Cylinder cylinder = new Cylinder(base, 10);
        assertEquals(base.area() * 10, cylinder.volume());
    }

    @Test
    void testInvalidHeight() throws InvalidRadiusException {
        Circle base = new Circle(5);
        assertThrows(InvalidDimensionException.class, () -> new Cylinder(base, 0));
        assertThrows(InvalidDimensionException.class, () -> new Cylinder(base, -1));
    }
}
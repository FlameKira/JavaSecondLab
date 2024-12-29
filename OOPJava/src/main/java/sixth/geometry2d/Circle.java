package sixth.geometry2d;

import sixth.exceptions.InvalidRadiusException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws InvalidRadiusException {
        if (radius <= 0) {
            throw new InvalidRadiusException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle with radius: " + radius;
    }
}
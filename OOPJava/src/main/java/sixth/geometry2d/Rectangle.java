package sixth.geometry2d;

import sixth.exceptions.InvalidDimensionException;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws InvalidDimensionException {
        if (width <= 0 || height <= 0) {
            throw new InvalidDimensionException("Ширина и высота должны быть положительными");
        }
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
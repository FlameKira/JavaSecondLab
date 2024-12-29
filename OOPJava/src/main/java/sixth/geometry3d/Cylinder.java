package sixth.geometry3d;

import sixth.geometry2d.Figure;
import sixth.exceptions.InvalidDimensionException;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) throws InvalidDimensionException {
        if (height <= 0) {
            throw new InvalidDimensionException("Высота должна быть положительной");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }
}
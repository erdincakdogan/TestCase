package org.Shape;

class Triangle extends AbstractShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
    @Override
    double calculatePerimeter() {
        return 0.5 * base * height;
    }
}

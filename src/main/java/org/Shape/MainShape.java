package org.Shape;


public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(6, 8);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Sqaure Area: " + square.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}

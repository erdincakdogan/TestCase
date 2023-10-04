package org.SquareCalculate;


public class SquareCalculate{
    public static void main(String[] args) {
        Square square = new Square(-6.0,5.0);

        double area = square.calculateArea();
        double perimeter = square.calculatePerimeter();

        System.out.println("Square area is : " + area);
        System.out.println("Square perimeter is: "+perimeter);

    }
}
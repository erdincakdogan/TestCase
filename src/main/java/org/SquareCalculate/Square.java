package org.SquareCalculate;


public class Square {
    private double height;
    private double width;
    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double calculateArea (){
        return (height * width);
    }
    public double calculatePerimeter (){
        return 2 * (height + width);
    }







}
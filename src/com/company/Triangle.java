package com.company;

public class Triangle extends Shape {
    private int height;
    private int width;

    public Triangle() {
    }

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Triangle(double numSides, int height, int width) {
        super(3);
        this.height = height;
        this.width = width;
    }

    @Override
    void getArea() {
        int arae = (height * width)/2;
        System.out.println("area of triangle : " + arae);
    }

    @Override
    void getPreimeter() {
        int perimeter = (height + width+height);
        System.out.println("perimeter of triangle :" + perimeter);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }
}

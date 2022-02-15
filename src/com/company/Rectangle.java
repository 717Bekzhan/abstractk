package com.company;

public class Rectangle extends Shape {
    private int width;
    private int heidht;

    public Rectangle() {
    }

    public Rectangle(int width, int heidht) {
        this.width = width;
        this.heidht = heidht;
    }

    public Rectangle(double numSides, int width, int heidht) {
        super(4);
        this.width = width;
        this.heidht = heidht;
    }

    @Override
    void getArea() {
        int area = (width * heidht);
        System.out.println("area of rectangle :" + area);
    }

    @Override
    void getPreimeter() {
        int perimetr = (2*(heidht + heidht));
        System.out.println("perimeter of rectangle : " + perimetr);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", heidht=" + heidht +
                "} " + super.toString();
    }
}

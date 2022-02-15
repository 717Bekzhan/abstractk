package com.company;

public class Main {

    public static void main(String[] args) {
        Shape rectange = new Rectangle(5, 6);
        Shape triangle = new Triangle(3,5);

        System.out.println(triangle);
        triangle.getArea();
        triangle.getPreimeter();

        System.out.println("     ");

        System.out.println(rectange);
        rectange.getPreimeter();
        rectange.getArea();


    }
}

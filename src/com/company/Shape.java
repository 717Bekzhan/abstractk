package com.company;

public abstract class Shape  {
    private double numSides;

    public Shape() {
    }

    public Shape(double numSides) {
        this.numSides = numSides;
    }
    abstract void getArea();

    abstract void getPreimeter();

    public double getNumSides() {
        return numSides;

    }

    @Override
    public String toString() {
        return "Shape{" +
                "numSides=" + numSides +
                '}';
    }
}

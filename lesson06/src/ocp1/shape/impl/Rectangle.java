package ocp1.shape.impl;


import ocp1.shape.Shape;

public class Rectangle implements Shape {
    int side1;
    int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1*side2;
    }
}

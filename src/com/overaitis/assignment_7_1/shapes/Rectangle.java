package com.overaitis.assignment_7_1.shapes;

import com.overaitis.assignment_7_1.Shape;

public class Rectangle extends Shape {
    private final double length, width;
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}

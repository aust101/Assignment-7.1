package com.overaitis.assignment_7_1.shapes;

import com.overaitis.assignment_7_1.Shape;

public class Triangle extends Shape {
    private final double base, height;
    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height * base) / 2.0;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

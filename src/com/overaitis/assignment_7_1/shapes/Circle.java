package com.overaitis.assignment_7_1.shapes;

import com.overaitis.assignment_7_1.Shape;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}

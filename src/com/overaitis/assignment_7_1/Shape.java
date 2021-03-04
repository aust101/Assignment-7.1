package com.overaitis.assignment_7_1;

public abstract class Shape {

    private final String name;
    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
}

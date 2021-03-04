package com.overaitis.assignment_7_1;

import com.overaitis.assignment_7_1.shapes.Circle;
import com.overaitis.assignment_7_1.shapes.Rectangle;
import com.overaitis.assignment_7_1.shapes.Triangle;

public class Main {

    public static void main(String[] args) {
	    Shape[] shapes = {
	            new Rectangle(10, 15),
	            new Rectangle(10, 10),
	            new Triangle(15, 20),
                new Triangle(5, 5),
                new Circle(15),
                new Circle(25)
        };
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.println("\nShape #" + (i+1) + ":");
            System.out.println("\tType: " + shape.getName());
            System.out.println("\tArea: " + shape.getArea());
            System.out.println("\tSpecs:");
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("\t\t- Length: " + rectangle.getLength());
                System.out.println("\t\t- Width: " + rectangle.getWidth());
            }
            else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                System.out.println("\t\t- Base: " + triangle.getBase());
                System.out.println("\t\t- Height: " + triangle.getHeight());
            }
            else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("\t\t- Radius: " + circle.getRadius());
            }
        }
    }
}

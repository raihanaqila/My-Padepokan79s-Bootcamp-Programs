package org.example.OOP.Materi6.Childs;

import org.example.OOP.Materi6.Parents.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        // TODO Auto-generated constructor stub
    }

    public Circle(String color, double radius) {
        setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    //Override dan Implementasi method abstract getArea untuk class Circle
    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

package org.example.OOP.Materi6.Childs;

import org.example.OOP.Materi6.Parents.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        // TODO Auto-generated constructor stub
    }

    public Triangle(double base, double height, String color) {
        setColor(color);
        this.base = base;
        this.height = height;
    }

    //Override dan Implementasi method abstract getArea
    @Override
    public double getArea() {
        double area = 0.5 * base * height;
        return area;
    }
}

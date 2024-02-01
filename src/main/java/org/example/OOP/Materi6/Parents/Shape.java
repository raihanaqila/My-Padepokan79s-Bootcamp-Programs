package org.example.OOP.Materi6.Parents;

public abstract class Shape {
    private String color;

    public Shape() {
        // TODO Auto-generated constructor stub
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //abstract method getArea
    public abstract double getArea();
}

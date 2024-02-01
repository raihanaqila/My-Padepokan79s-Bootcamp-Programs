package org.example.OOP.Materi6.Parents;

public abstract class Product {
    private String name;

    public Product() {
        // TODO Auto-generated constructor stub
    }

    public Product (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //abstract method printInformation
    public abstract void printInformation();
}

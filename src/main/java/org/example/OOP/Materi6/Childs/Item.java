package org.example.OOP.Materi6.Childs;

import org.example.OOP.Materi6.Parents.Product;

public class Item extends Product {
    private int price;

    public Item() {
        // TODO Auto-generated constructor stub
    }

    public Item(String name, int price) {
        super(name);
        this.price = price;
    }

    //Implementasi Method Abstract pada Child Class supaya menjadi bentuk Konkrit dan Jelas.
    @Override
    public void printInformation() {
        System.out.println("Product Name : " + getName());
        System.out.println("Product Price : " + getPrice());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

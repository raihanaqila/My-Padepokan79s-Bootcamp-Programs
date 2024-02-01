package org.example.OOP.Materi6;

import org.example.OOP.Materi6.Childs.Circle;
import org.example.OOP.Materi6.Childs.Item;
import org.example.OOP.Materi6.Childs.Triangle;
import org.example.OOP.Materi6.Parents.Product;
import org.example.OOP.Materi6.Parents.Shape;

public class MainApp {
    /* Product product1 = new Product(); //Tidak dapat langsung diinstansiasi menjadi Object karena Class Product adalah Abstract. */
    Product product2 = new Item(); //Dapat membuat object Product dari instansiasi Child Class Item

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shape lingkaran = new Circle("Biru", 20);
        Shape segitiga = new Triangle(10, 15, "Merah");

        System.out.println("Luas Lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
        System.out.println("Luas Segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
    }
}

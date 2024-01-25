package org.example.OOP.Materi1;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //Constructor Default
    Person() {

    }

    //Constructor dengan satu parameter
    Person(String paramName) {
        name = paramName;
    }

    //Constructor dengan Parameter
    Person(String paramName, String paramAddress) {
        this(paramName);
        address = paramAddress;
    }

    /* Person(String name, String address) {
        //Gunakan keyword this untuk solving variable shadowing

        this.name = name; //this.name -> menunjukkan field name dari class Person itu sendiri
        this.address = address; //this.address -> menunjukkan field address dari class Person itu sendiri
    } */

    //Method void
    void sayHello (String paramName) {
        System.out.println("Hello " + paramName + ", Myname is " + name + ".");
    }

    //Method return value (Mengembalikan Nilai)
    String sayAddress() {
        return "I come from " + address + ".";
    }
}

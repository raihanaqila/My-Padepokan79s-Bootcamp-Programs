package org.example.OOP.Materi1;

public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Eko";
        person1.address = "Tegal";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Padepokan 79");

        Person person2 = new Person();
        person2.sayHello("Padepokan 79");
        System.out.println(person2.sayAddress());

        //Membuat object dari class Person menggunakan Constructor Parameter
        Person person3 = new Person("Eko", "Tegal");
        person3.sayHello("Padepokan 79");
        System.out.println(person3.sayAddress());

        //Membuat object dari class Person menggunakan Constructor Default
        Person person4 = new Person();
        person4.name = "Joko";
        person4.address = "Surabaya";
        person4.sayHello("Padepokan 79");
        System.out.println(person4.sayAddress());

        //Membuat object dari class Person menggunakan Constructor satu parameter
        Person person5 = new Person("Budi");
        person5.address = "Bandung";
        person5.sayHello("Padepokan 79");
        System.out.println(person5.sayAddress());
    }
}

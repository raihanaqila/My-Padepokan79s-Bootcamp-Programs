package org.example.OOP.Materi5;

import org.example.OOP.Materi5.Childs.Doctor;
import org.example.OOP.Materi5.Childs.Programmer;
import org.example.OOP.Materi5.Childs.Teacher;
import org.example.OOP.Materi5.Parents.Person;

public class AppMain {
    //Sekarang di AppMain tidak ada error
    public static void main(String[] args) {
        Person person1 = new Programmer("Rizky", "Bandung", ".Net Core"); //Polymorphism
        person1.greeting();

        /* System.out.println(person1.technology); //error, tidak bisa dipanggil langsung seperti ini */
        System.out.println(((Programmer)person1).getTechnology());  //output: .Net Core

        Person person2 = new Teacher("Joko", "Tegal", "Matematika");
        Person person3 = new Doctor("Eko", "Surabaya", "Pedistrician");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);

        //Pembuatan object
        Person person4 = new Person();
        /* person4.name = "Rizki"; //Salah, tidak bisa */
        person4.setName("Rizki"); //Benar
        person4.setAddress("Bandung");

        /* System.out.println(person4.name); //Salah, karena field name private */
        System.out.println(person4.getName()); //Benar
        System.out.println(person4.getAddress());
    }

    static void sayHello(Person person) {
        String message;
        if(person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            message = "Hello, " + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".";
        }
        else if(person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
        }
        else if(person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, " + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".";
        }
        else {
            message = "Hello, " + person.getName() + ".";
        }
        System.out.println(message);
    }
}

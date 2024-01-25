package org.example.OOP.Materi2;

public class Teacher extends Person {
    String subject;

    void teaching() {
        System.out.println("I can teach " + subject + ", so anyone who wants to learn can talk to me.");
    }

    @Override //Mengganti isi greeting dari yang tadinya default sama kayak di kelas parent menjadi isi khas kelas child ini
    void greeting() {
        super.greeting(); //Mengambil greeting yang ada di kelas parent (Person)
        System.out.println("My job is a " + subject + " teacher."); //isi greeting parent + greeting khas kelas child Teacher
    }
}

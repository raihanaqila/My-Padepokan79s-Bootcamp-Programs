package org.example.OOP.Materi3;

public class Teacher extends Person {
    String subject;

    public Teacher() {
        // TODO Auto-generated constructor stub
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    void teaching() {
        System.out.println("I can teach " + subject + ", so anyone who wants to learn can talk to me.");
    }

    @Override //Mengganti isi greeting dari yang tadinya default sama kayak di kelas parent menjadi isi khas kelas child ini
    void greeting() {
        super.greeting(); //Mengambil greeting yang ada di kelas parent (Person)
        System.out.println("My job is a " + subject + " teacher."); //isi greeting parent + greeting khas kelas child Teacher
    }
}

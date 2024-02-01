package org.example.OOP.Materi5.Childs;

import org.example.OOP.Materi5.Parents.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
        // TODO Auto-generated constructor stub
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public void teaching() {
        System.out.println("I can teach " + subject + ", so anyone who wants to learn can talk to me.");
    }

    @Override //Mengganti isi greeting dari yang tadinya default sama kayak di kelas parent menjadi isi khas kelas child ini
    public void greeting() {
        System.out.println("Hello my name is " + getName() + ".");
        System.out.println("I come from " + getAddress() + ".");
        System.out.println("My job is a " + subject + " teacher."); //isi greeting parent + greeting khas kelas child Teacher
    }

    //setter and getter
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}

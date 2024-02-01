package org.example.OOP.Materi5.Childs;

import org.example.OOP.Materi5.Parents.Person;

public class Programmer extends Person {
    private String technology;

    public Programmer() {
        super();   // sama saja diisi dengan super() ataupun kosong.
    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        /* syntax di atas bisa juga diisi dengan:
         * super.name = name;
         * super.address = address;
         * */
        this.technology = technology;
    }

    public void hacking() {
        System.out.println("I can hack a website.");
    }

    public void coding() {
        System.out.println("I can create an application using technology : " + technology + ".");
    }

    @Override //Mengganti isi greeting dari yang tadinya default sama kayak di kelas parent menjadi isi khas kelas child ini
    public void greeting() {
        System.out.println("Hello my name is " + getName() + ".");
        System.out.println("I come from " + getAddress() + ".");
        System.out.println("My job is a " + technology + " programmer.");
    }

    //setter and getter
    public String getTechnology() {
        return this.technology;
    }
    public void setTechnology(String technology) {
        this.technology = technology;
    }
}

package org.example.OOP.Materi4.Childs;

import org.example.OOP.Materi4.Parents.Person;

public class Programmer extends Person {
    public String technology;

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
        super.greeting(); //Mengambil greeting yang ada di kelas parent (Person)
        System.out.println("My job is a " + technology + " programmer.");
    }
}

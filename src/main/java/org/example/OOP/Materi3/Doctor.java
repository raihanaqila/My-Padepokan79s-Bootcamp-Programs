package org.example.OOP.Materi3;

public class Doctor extends Person {
    String specialist;

    public Doctor() {
        // TODO Auto-generated constructor stub
    }

    //Super Constructor
    public Doctor(String name, String address, String specialist) {
        super(name, address); //membuat konfigurasi perintah yang sama dengan name & address yang ada di class Parent (Person)
        this.specialist = specialist;
    }

    void surgery() {
        System.out.println("I can do surgery operation to Patients");
    }

    @Override //Mengganti isi greeting dari yang tadinya default sama kayak di kelas parent menjadi isi khas kelas child ini
    void greeting() {
        super.greeting(); //Mengambil greeting yang ada di kelas parent (Person)
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
}

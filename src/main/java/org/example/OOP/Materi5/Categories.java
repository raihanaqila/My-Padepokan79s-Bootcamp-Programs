package org.example.OOP.Materi5;

public class Categories {
    //Menggunakan access modifier private pada field atau attribute
    int id;
    String name;
    boolean expensive;

    public Categories(int id, String name, boolean expensive) {
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    public Categories() {
        super();
    }

    //Contoh Getter dan Setter tipe data boolean

    //getter
    public boolean isExpensive() {
        return this.expensive;
    }

    //setter
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    //Tipe data Object
    //Getter
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Tipe data primitif (integer)
    //Getter
    public int getId() {
        return this.id;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }
}

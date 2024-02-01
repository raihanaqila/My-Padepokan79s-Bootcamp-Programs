package org.example.OOP.BookCase.Childs;

import org.example.OOP.BookCase.Parents.Author;

public class Novelis extends Author {
    private Boolean serial;
    private String rating;

    public Novelis() {
        // TODO Auto-generated constructor stub
    }

    public Novelis(String firstName, String lastName, String country, int age, Boolean serial, String rating) {
        super(firstName, lastName, country, age);
        this.serial = serial;
        this.rating = rating;
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public String toString() {
        return "Novelis{" + super.toString() +
                "serial=" + serial +
                ", rating='" + rating + '\'' +
                '}';
    }

    public Boolean getSerial() {
        return serial;
    }

    public void setSerial(Boolean serial) {
        this.serial = serial;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}

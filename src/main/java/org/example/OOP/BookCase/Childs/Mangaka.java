package org.example.OOP.BookCase.Childs;

import org.example.OOP.BookCase.Parents.Author;

public class Mangaka extends Author {
    private String rating;

    public Mangaka() {
        // TODO Auto-generated constructor stub
    }

    public Mangaka(String firstName, String lastName, String country, int age, String rating) {
        super(firstName, lastName, country, age);
        this.rating = rating;
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public String toString() {
        return "Mangaka{" + super.toString() +
                "rating='" + rating + '\'' +
                '}';
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}


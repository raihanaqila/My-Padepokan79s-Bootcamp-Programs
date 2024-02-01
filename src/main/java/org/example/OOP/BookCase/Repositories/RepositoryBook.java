package org.example.OOP.BookCase.Repositories;

import org.example.OOP.BookCase.Parents.CommercialBook;

import java.util.ArrayList;
import java.util.List;

public class RepositoryBook {
    private final List<CommercialBook> books;

    public RepositoryBook() {
        this.books = new ArrayList<>();
    }

    public void addBook(CommercialBook book) {
        books.add(book);
    }

    public List<CommercialBook> getAllBooks() {
        return new ArrayList<>(books);
    }
}

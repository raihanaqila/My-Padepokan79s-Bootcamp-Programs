package org.example.OOP.BookCase.Childs;

import org.example.OOP.BookCase.Parents.Author;
import org.example.OOP.BookCase.Parents.CommercialBook;
import org.example.OOP.BookCase.Publisher;

public class EBook extends CommercialBook {

    public EBook() {
        // TODO Auto-generated constructor stub
    }

    public EBook(String bookCode, String title, Author author, Publisher publisher, double price) {
        super(bookCode, title, author, publisher, price);
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        double productionCost = getPublisher().getProductionCost();
        setPrice(productionCost * 120 / 100);
    }

    @Override
    public String toString() {
        return "EBook{" + "CommercialBook{" +
            "bookCode='" + getBookCode() + '\'' +
                    ", title='" + getTitle() + '\'' +
                    ", author=" + (getAuthor() != null ? "'" + getFullName() + '\'' : "null") +
                    ", publisher=" + (getPublisher() != null ? "'" + getPublisher().getPublisherName() + '\'' : "null") +
                    ", price=" + getPrice() +
                    '}' + "}";
    }


}

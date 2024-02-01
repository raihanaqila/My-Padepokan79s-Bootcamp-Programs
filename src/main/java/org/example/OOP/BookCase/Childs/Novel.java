package org.example.OOP.BookCase.Childs;

import org.example.OOP.BookCase.Parents.Author;
import org.example.OOP.BookCase.Parents.CommercialBook;
import org.example.OOP.BookCase.Publisher;

import java.util.Objects;

public class Novel extends CommercialBook {

    private String genre;

    private Novelis author;

    public Novel() {
        // TODO Auto-generated constructor stub
    }

    public Novel(String bookCode, String title, Novelis author, Publisher publisher, double price, String genre) {
        super(bookCode, title, author, publisher, price);
        this.genre = genre;
        this.author = author;
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        double productionCost = getPublisher().getProductionCost();
        Novelis novelis = (Novelis) getAuthor();
        String rating = novelis.getRating();
        if(Objects.equals(rating, "New Commer")) {
            double novelPrice = productionCost * 125 / 100;
            setPrice(novelPrice);
        }
        else if(Objects.equals(rating, "Good")) {
            double novelPrice = productionCost * 135 / 100;
            setPrice(novelPrice);
        }
        else if(Objects.equals(rating, "Best Seller")) {
            double novelPrice = productionCost * 150 / 100;
            setPrice(novelPrice);
        }
    }

    @Override
    public String toString() {
        return "Novel{" + "CommercialBook{" +
                "bookCode='" + getBookCode() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author=" + (getAuthor() != null ? "'" + getAuthor().getFullName() + '\'' : "null") +
                ", publisher=" + (getPublisher() != null ? "'" + getPublisher().getPublisherName() + '\'' : "null") +
                ", price=" + getPrice() +
                ", genre='" + getGenre() + '\'' +
                '}' + '}';
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public Author getAuthor() {
        return author;
    }


    public void setAuthor(Novelis author) {
        this.author = author;
    }
}

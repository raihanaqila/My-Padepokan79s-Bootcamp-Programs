package org.example.OOP.BookCase.Childs;

import org.example.OOP.BookCase.Parents.CommercialBook;
import org.example.OOP.BookCase.Publisher;

import java.util.Objects;

public class Comic extends CommercialBook {

    private Boolean volumeSeries;

    private double tax;

    private Mangaka author;

    public Comic() {
        // TODO Auto-generated constructor stub
    }

    public Comic(String bookCode, String title, Mangaka author, Publisher publisher, double price, Boolean volumeSeries, double tax) {
        super(bookCode, title, author, publisher, price);
        this.author = author;
        this.volumeSeries = volumeSeries;
        this.tax = tax;
        calculatePrice();
        calculateTax();
    }

    @Override
    public void calculatePrice() {
        Mangaka mangaka = getAuthor();
        String rating = mangaka.getRating();
        double productionCost = getPublisher().getProductionCost();
        if(Objects.equals(rating, "New Commer") && volumeSeries) {
            double comicPrice = productionCost * 135 / 100;
            setPrice(comicPrice);
        }
        else if(Objects.equals(rating, "New Commer") && !volumeSeries) {
            double comicPrice = productionCost * 125 / 100;
            setPrice(comicPrice);
        }
        else if (Objects.equals(rating, "Good") && volumeSeries) {
            double comicPrice = productionCost * 145 / 100;
            setPrice(comicPrice);
        }
        else if (Objects.equals(rating, "Good") && !volumeSeries) {
            double comicPrice = productionCost * 130 / 100;
            setPrice(comicPrice);
        }
        else if (Objects.equals(rating, "Best Seller") && volumeSeries) {
            double comicPrice = productionCost * 150 / 100;
            setPrice(comicPrice);
        }
        else if (Objects.equals(rating, "Best Seller") && !volumeSeries) {
            double comicPrice = productionCost * 140 / 100;
            setPrice(comicPrice);
        }
    }

    @Override
    public String toString() {
        return "Comic{" + "CommercialBook{" +
                "bookCode='" + getBookCode() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author=" + (getAuthor() != null ? "'" + getAuthor().getFullName() + '\'' : "null") +
                ", publisher=" + (getPublisher() != null ? "'" + getPublisher().getPublisherName() + '\'' : "null") +
                ", price=" + getPrice() +
                ", tax=" + getTax() +
                ", volumeSeries=" + getVolumeSeries() +
                '}' + '}';
    }

    public void calculateTax() {
        tax = getPrice() * 5 / 100;
        setTax(tax);
    }

    public Boolean getVolumeSeries() {
        return volumeSeries;
    }

    public void setVolumeSeries(Boolean volumeSeries) {
        this.volumeSeries = volumeSeries;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public Mangaka getAuthor() {
        return author;
    }


    public void setAuthor(Mangaka author) {
        this.author = author;
    }
}

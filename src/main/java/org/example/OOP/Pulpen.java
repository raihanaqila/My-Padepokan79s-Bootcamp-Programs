package org.example.OOP;

public class Pulpen {
    String series;
    String name;
    String type;
    String feature1;
    String feature2;
    String feature3;
    String stylus;
    final String refillAble = "Refill-able";
    double tipSize;
    final String inkColour = "Blue and Black";
    final String packingDetails1 = "50 Pcs. Box";
    final String packingDetails2 = "50 Pcs. Shipper";

    public Pulpen(String series, String name, String type, String feature1, String feature2, String feature3, String stylus, double tipSize) {
        this.series = series;
        this.name = name;
        this.type = type;
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.feature3 = feature3;
        this.stylus = stylus;
        this.tipSize = tipSize;
    }

    public Pulpen(String series, String name, String type, String feature1, String feature2, String feature3, double tipSize) {
        this.series = series;
        this.name = name;
        this.type = type;
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.feature3 = feature3;
        this.tipSize = tipSize;
    }

    public Pulpen() {

    }
}

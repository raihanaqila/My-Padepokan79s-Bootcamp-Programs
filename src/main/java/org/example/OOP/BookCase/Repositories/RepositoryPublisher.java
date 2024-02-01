package org.example.OOP.BookCase.Repositories;

import org.example.OOP.BookCase.Publisher;

import java.util.ArrayList;
import java.util.List;

public class RepositoryPublisher {
    private final List<Publisher> publishers;

    public RepositoryPublisher() {
        this.publishers = new ArrayList<>();
    }

    public void addPublisher(Publisher publisher) {
        publishers.add(publisher);
    }

    public List<Publisher> getAllPublishers() {
        return new ArrayList<>(publishers);
    }
}

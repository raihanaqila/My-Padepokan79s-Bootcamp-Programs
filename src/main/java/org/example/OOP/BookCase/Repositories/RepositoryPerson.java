package org.example.OOP.BookCase.Repositories;

import org.example.OOP.BookCase.Childs.Mangaka;
import org.example.OOP.BookCase.Childs.Novelis;
import org.example.OOP.BookCase.Interfaces.Person;
import org.example.OOP.BookCase.Parents.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositoryPerson {
    private final List<Author> authors;
    private final List<Mangaka> mangakas;
    private final List<Novelis> novelists;

    public RepositoryPerson() {
        this.authors = new ArrayList<>();
        this.mangakas = new ArrayList<>();
        this.novelists = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addMangaka(Mangaka author) {
        mangakas.add(author);
    }

    public void addNovelist(Novelis author) {
        novelists.add(author);
    }

    public List<Mangaka> getAllMangakas() {
        return new ArrayList<>(mangakas);
    }

    public List<Author> getAllAuthors() {
        return new ArrayList<>(authors);
    }

    public List<Novelis> getAllNovelists() {
        return new ArrayList<>(novelists);
    }

    public List<Person> getAllPersons() {
        List<Person> allPersons = new ArrayList<>(authors);
        allPersons.addAll(mangakas);
        allPersons.addAll(novelists);

        return allPersons;
    }

    public List<Person> getPersonsByAgeRange(int minAge, int maxAge) {
        return getAllPersons().stream()
                .filter(person -> person.getAge() >= minAge && person.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public List<Person> getPersonsByCountry(String country) {
        return getAllPersons().stream()
                .filter(person -> person.getCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
    }
}

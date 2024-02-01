package org.example.OOP.BookCase;

import org.example.OOP.BookCase.Childs.*;
import org.example.OOP.BookCase.Interfaces.Person;
import org.example.OOP.BookCase.Parents.Author;
import org.example.OOP.BookCase.Parents.CommercialBook;
import org.example.OOP.BookCase.Repositories.RepositoryBook;
import org.example.OOP.BookCase.Repositories.RepositoryPerson;
import org.example.OOP.BookCase.Repositories.RepositoryPublisher;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainApp {
    private static final RepositoryBook repoBook = new RepositoryBook();

    private static final RepositoryPerson repoPerson = new RepositoryPerson();

    private static final RepositoryPublisher repoPublisher = new RepositoryPublisher();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Author author1 = new Author("Haidar", "Musyafa", "Indonesia", 30);
        Author author2 = new Author("Bert", "Bates", "United States", 50);
        Author author3 = new Author("Barry", "Burd", "United States", 52);
        Author author4 = new Author("Mark", "Manson", "United States", 38);
        Author author5 = new Author("Andi", "Susanto", "Indonesia", 32);
        Author author6 = new Author("Adi", "Sutanto", "Indonesia", 27);

        repoPerson.addAuthor(author1);
        repoPerson.addAuthor(author2);
        repoPerson.addAuthor(author3);
        repoPerson.addAuthor(author4);
        repoPerson.addAuthor(author5);
        repoPerson.addAuthor(author6);

        Novelis novelis1 = new Novelis("J.K", "Rowling", "England", 57, true, "Best Seller");
        Novelis novelis2 = new Novelis("Tere", "Liye", "Indonesia", 35, true, "Best Seller");
        Novelis novelis3 = new Novelis("Dee", "Lestari", "Indonesia", 30, true, "Good");
        Novelis novelis4 = new Novelis("Faisal", "Syahreza", "Indonesia", 40, true, "New Commer");
        Novelis novelis5 = new Novelis("Julia", "Golding", "England", 41, false,"Best Seller");

        repoPerson.addNovelist(novelis1);
        repoPerson.addNovelist(novelis2);
        repoPerson.addNovelist(novelis3);
        repoPerson.addNovelist(novelis4);
        repoPerson.addNovelist(novelis5);

        Mangaka mangaka1 = new Mangaka("Masashi", "Kisimoto", "Japan", 48, "Best Seller");
        Mangaka mangaka2 = new Mangaka("Yoshihiro", "Togashi", "Japan", 56, "Good");
        Mangaka mangaka3 = new Mangaka("Eiichiro", "Oda", "Japan", 57, "Best Seller");
        Mangaka mangaka4 = new Mangaka("Rizki", "Anwar", "Indonesia", 25, "New Commer");
        Mangaka mangaka5 = new Mangaka("Yusuf", "Fadli", "Indonesia", 32, "New Commer");

        repoPerson.addMangaka(mangaka1);
        repoPerson.addMangaka(mangaka2);
        repoPerson.addMangaka(mangaka3);
        repoPerson.addMangaka(mangaka4);
        repoPerson.addMangaka(mangaka5);

        Publisher publisher1 = new Publisher("Bloomsbury", "United Kingdom", 30.0);
        Publisher publisher2 = new Publisher("Gramedia", "Indonesia", 50.0);
        Publisher publisher3 = new Publisher("Mizan", "Indonesia", 25.0);
        Publisher publisher4 = new Publisher("Shueisha", "Japan", 25.0);
        Publisher publisher5 = new Publisher("Elex Media Komputindo", "Indonesia", 12.0);
        Publisher publisher6 = new Publisher("Gramedia Pustaka Utama", "Indonesia", 15.0);
        Publisher publisher7 = new Publisher("Lion Hudson", "England", 15.0);
        Publisher publisher8 = new Publisher("O Reilly Media", "United States", 30.0);
        Publisher publisher9 = new Publisher("Harper One", "United States", 25.0);

        repoPublisher.addPublisher(publisher1);
        repoPublisher.addPublisher(publisher2);
        repoPublisher.addPublisher(publisher3);
        repoPublisher.addPublisher(publisher4);
        repoPublisher.addPublisher(publisher5);
        repoPublisher.addPublisher(publisher6);
        repoPublisher.addPublisher(publisher7);
        repoPublisher.addPublisher(publisher8);
        repoPublisher.addPublisher(publisher9);

        CommercialBook commercialBook1 = new EBook("Book - 001", "Memahami Hamka", author1, publisher3, publisher3.getProductionCost());
        CommercialBook commercialBook2 = new EBook("Book - 002", "Head First Java: Your Brain on Java - A Learner's Guide", author2, publisher8, publisher8.getProductionCost());
        CommercialBook commercialBook3 = new EBook("Book - 003", "Java For Dummies", author3, publisher8, publisher8.getProductionCost());
        CommercialBook commercialBook4 = new EBook("Book - 004", "Flutter For Dummies", author3, publisher8, publisher8.getProductionCost());
        CommercialBook commercialBook5 = new EBook("Book - 005", "The Subtle Art of Not Giving", author4, publisher9, publisher9.getProductionCost());
        CommercialBook commercialBook6 = new EBook("Book - 006", "Will", author4, publisher9, publisher9.getProductionCost());
        CommercialBook commercialBook7 = new EBook("Book - 007", "Sejarah Indonesia", author5, publisher6, publisher6.getProductionCost());
        CommercialBook commercialBook8 = new EBook("Book - 008", "Teknologi Baru", author6, publisher5, publisher5.getProductionCost());

        repoBook.addBook(commercialBook1);
        repoBook.addBook(commercialBook2);
        repoBook.addBook(commercialBook3);
        repoBook.addBook(commercialBook4);
        repoBook.addBook(commercialBook5);
        repoBook.addBook(commercialBook6);
        repoBook.addBook(commercialBook7);
        repoBook.addBook(commercialBook8);

        CommercialBook commercialBook9 = new Novel("Novel - 001", "Harry Potter and the Philosopher's Stone", novelis1, publisher1, publisher1.getProductionCost(), "Fantasy");
        CommercialBook commercialBook10 = new Novel("Novel - 002", "Harry Potter and the Chamber of Secrets", novelis1, publisher1, publisher1.getProductionCost(), "Fantasy");
        CommercialBook commercialBook11 = new Novel("Novel - 003", "Harry Potter and the Prisoner of Azkaban", novelis1, publisher1, publisher1.getProductionCost(), "Fantasy");
        CommercialBook commercialBook12 = new Novel("Novel - 004", "Ayah Aku Berbeda", novelis2, publisher2, publisher2.getProductionCost(), "Drama");
        CommercialBook commercialBook13 = new Novel("Novel - 005", "Madre", novelis3, publisher2, publisher2.getProductionCost(), "Drama");
        CommercialBook commercialBook14 = new Novel("Novel - 006", "Lagu untuk Renjana", novelis4, publisher3, publisher3.getProductionCost(), "Drama");
        CommercialBook commercialBook15 = new Novel("Novel - 007", "Semoga Lekas Lega", novelis4, publisher3, publisher3.getProductionCost(), "Drama");
        CommercialBook commercialBook16 = new Novel("Novel - 008", "The Abbey Mystery", novelis5, publisher7, publisher7.getProductionCost(), "Fiction");

        repoBook.addBook(commercialBook9);
        repoBook.addBook(commercialBook10);
        repoBook.addBook(commercialBook11);
        repoBook.addBook(commercialBook12);
        repoBook.addBook(commercialBook13);
        repoBook.addBook(commercialBook14);
        repoBook.addBook(commercialBook15);
        repoBook.addBook(commercialBook16);

        CommercialBook commercialBook17 = new Comic("Comic - 001", "Uzumaki Naruto", mangaka1, publisher4, publisher4.getProductionCost(), true, 0.0);
        CommercialBook commercialBook18 = new Comic("Comic - 002", "The Worst Client", mangaka1, publisher4, publisher4.getProductionCost(), true, 0.0);
        CommercialBook commercialBook19 = new Comic("Comic - 003", "For the Sake of Dreams...!!", mangaka1, publisher4, publisher4.getProductionCost(), true, 0.0);
        CommercialBook commercialBook20 = new Comic("Comic - 004", "Hunter X Hunter : The Day of Departure", mangaka2, publisher4, publisher4.getProductionCost(), true, 0.0);
        CommercialBook commercialBook21 = new Comic("Comic - 005", "Hunter X Hunter : A Struggle in the Mist", mangaka2, publisher4, publisher4.getProductionCost(), true, 0.0);
        CommercialBook commercialBook22 = new Comic("Comic - 006", "One Piece", mangaka3, publisher2, publisher2.getProductionCost(), true, 0.0);
        CommercialBook commercialBook23 = new Comic("Comic - 007", "Petualangan di Indonesia", mangaka4, publisher6, publisher6.getProductionCost(), false, 0.0);
        CommercialBook commercialBook24 = new Comic("Comic - 008", "Petualangan di Jakarta", mangaka5, publisher5, publisher5.getProductionCost(), false, 0.0);

        repoBook.addBook(commercialBook17);
        repoBook.addBook(commercialBook18);
        repoBook.addBook(commercialBook19);
        repoBook.addBook(commercialBook20);
        repoBook.addBook(commercialBook21);
        repoBook.addBook(commercialBook22);
        repoBook.addBook(commercialBook23);
        repoBook.addBook(commercialBook24);


        int pilihan;

        do {
            displayMainMenu();
            System.out.print("Masukkan Pilihan Anda: ");
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        bookMenu();
                        break;
                    case 2:
                        authorMenu();
                        break;
                    case 3:
                        publisherMenu();
                        break;
                    case 0:
                        System.out.println("Keluar dari program. Sampai jumpa!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan pilihan yang valid.");
                }
            }
            else {
                System.out.println("Input harus berupa bilangan bulat. Masukkan pilihan yang valid.");
                scanner.nextLine();
                pilihan = -1;
            }
        } while (pilihan != 0);
    }

    private static void displayMainMenu() {
        System.out.println("\nMain Menu");
        System.out.println("1. Book");
        System.out.println("2. Author");
        System.out.println("3. Publisher");
        System.out.println("0. Exit");
    }

    private static void bookMenu() {
        int pilihan;

        do {
            displayBookMenu();
            System.out.print("Masukkan Pilihan Anda: ");
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.println();
                        searchCheapestBook();
                        break;
                    case 2:
                        System.out.println();
                        searchMostExpensiveBook();
                        break;
                    case 3:
                        System.out.println();
                        searchBooksByPriceRange();
                        break;
                    case 4:
                        System.out.println();
                        searchComicsByMangakaRating();
                        break;
                    case 5:
                        System.out.println();
                        searchBooksByPublisherCountry();
                        break;
                    case 6:
                        System.out.println();
                        searchBooksByAuthorCountry();
                        break;
                    case 7:
                        System.out.println();
                        searchMostExpensiveComic();
                        break;
                    case 0:
                        System.out.println("Kembali ke menu utama.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan pilihan yang valid.");
                }
            }
            else {
                System.out.println("Input harus berupa bilangan bulat. Masukkan pilihan yang valid.");
                scanner.nextLine();
                pilihan = -1;
            }
        } while (pilihan != 0);
    }

    private static void displayBookMenu() {
        System.out.println("\nBook Menu Searching");
        System.out.println("1. Cari data book yang memiliki price paling Murah.");
        System.out.println("2. Cari data book yang memiliki price paling Mahal.");
        System.out.println("3. Cari data book berdasarkan range Price.");
        System.out.println("4. Cari Comic Berdasarkan Rating mangaka.");
        System.out.println("5. Cari Book berdasarkan Country dari Publishernya.");
        System.out.println("6. Cari Book berdasarkan Country dari Authornya.");
        System.out.println("7. Cari data Comic yang memiliki price paling Mahal.");
        System.out.println("0. Back to Main Menu");
    }

    private static void authorMenu() {
        int pilihan;

        do {
            displayAuthorMenu();
            System.out.print("Masukkan Pilihan Anda: ");
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.println();
                        searchAllMangaka();
                        break;
                    case 2:
                        System.out.println();
                        searchAllAuthors();
                        break;
                    case 3:
                        System.out.println();
                        searchAllNovelis();
                        break;
                    case 4:
                        System.out.println();
                        searchAuthorsByAgeRange();
                        break;
                    case 5:
                        System.out.println();
                        searchAuthorsByCountry();
                        break;
                    case 0:
                        System.out.println("Kembali ke menu utama.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan pilihan yang valid.");
                }
            }
            else {
                System.out.println("Input harus berupa bilangan bulat. Masukkan pilihan yang valid.");
                scanner.nextLine();
                pilihan = -1;
            }
        } while (pilihan != 0);
    }

    private static void displayAuthorMenu() {
        System.out.println("\nAuthor Menu Searching");
        System.out.println("1. Cari Data semua Mangaka.");
        System.out.println("2. Cari Data semua Author.");
        System.out.println("3. Cari Data semua Novelis.");
        System.out.println("4. Cari author berdasarkan Range umur.");
        System.out.println("5. Cari author berdasarkan Country.");
        System.out.println("0. Back to Main Menu");
    }

    private static void publisherMenu() {
        int pilihan;

        do {
            displayPublisherMenu();
            System.out.print("Masukkan Pilihan Anda: ");
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (pilihan) {
                    case 1:
                        System.out.println();
                        searchPublisherWithHighestProductionCost();
                        break;
                    case 2:
                        System.out.println();
                        searchPublisherWithLowestProductionCost();
                        break;
                    case 0:
                        System.out.println("Kembali ke menu utama.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan pilihan yang valid.");
                }
            }
            else {
                System.out.println("Input harus berupa bilangan bulat. Masukkan pilihan yang valid.");
                scanner.nextLine();  // Consume invalid input
                pilihan = -1;
            }
        } while (pilihan != 0);
    }

    private static void displayPublisherMenu() {
        System.out.println("\nPublisher Menu Searching");
        System.out.println("1. Cari Publisher dengan productionCost paling Mahal.");
        System.out.println("2. Cari Publisher dengan productionCost paling Murah.");
        System.out.println("0. Back to Main Menu");
    }

    private static void searchCheapestBook() {
        List<CommercialBook> books = repoBook.getAllBooks();
        CommercialBook cheapestBook = books.stream()
                .min(Comparator.comparingDouble(CommercialBook::getPrice))
                .orElse(null);

        if (cheapestBook != null) {
            System.out.println("Buku dengan harga paling murah: ");
            System.out.println(cheapestBook);
        } else {
            System.out.println("Tidak ada buku tersedia.");
        }
    }

    private static void searchMostExpensiveBook() {
        List<CommercialBook> books = repoBook.getAllBooks();
        CommercialBook mostExpensiveBook = books.stream()
                .max(Comparator.comparingDouble(CommercialBook::getPrice))
                .orElse(null);

        if (mostExpensiveBook != null) {
            System.out.println("Buku dengan harga paling mahal:");
            System.out.println(mostExpensiveBook);
        } else {
            System.out.println("Tidak ada buku tersedia.");
        }
    }

    private static void searchBooksByPriceRange() {
        System.out.print("Masukkan batas harga: ");
        double maxPrice = scanner.nextDouble();
        List<CommercialBook> booksInRange = repoBook.getAllBooks().stream()
                .filter(book -> book.getPrice() <= maxPrice)
                .collect(Collectors.toList());

        if (!booksInRange.isEmpty()) {
            System.out.println();
            System.out.println("Buku dengan harga di bawah atau sama dengan " + maxPrice + ":");
            booksInRange.forEach(System.out::println);
        } else {
            System.out.println("Tidak ada buku dalam rentang harga yang dimasukkan.");
        }
    }

    private static void searchComicsByMangakaRating() {
        System.out.print("Masukkan rating Mangaka: ");
        String mangakaRating = scanner.nextLine();
        List<CommercialBook> comicsByRating = repoBook.getAllBooks().stream()
                .filter(book -> book instanceof Comic && ((Comic) book).getAuthor().getRating().equalsIgnoreCase(mangakaRating))
                .collect(Collectors.toList());

        if (!comicsByRating.isEmpty()) {
            System.out.println();
            System.out.println("Comic dengan rating Mangaka " + mangakaRating + ":");
            comicsByRating.forEach(System.out::println);
        } else {
            System.out.println("Tidak ada Comic dengan rating Mangaka yang dimasukkan.");
        }
    }

    private static void searchBooksByPublisherCountry() {
        System.out.print("Masukkan negara penerbit: ");
        String publisherCountry = scanner.nextLine();
        List<CommercialBook> booksByPublisherCountry = repoBook.getAllBooks().stream()
                .filter(book -> book.getPublisher().getCountry().equalsIgnoreCase(publisherCountry))
                .collect(Collectors.toList());

        if (!booksByPublisherCountry.isEmpty()) {
            System.out.println();
            System.out.println("Buku dengan penerbit dari negara " + publisherCountry + ":");
            booksByPublisherCountry.forEach(System.out::println);
        } else {
            System.out.println("Tidak ada buku dengan penerbit dari negara yang dimasukkan.");
        }
    }

    private static void searchBooksByAuthorCountry() {
        System.out.print("Masukkan negara penulis: ");
        String authorCountry = scanner.nextLine();

        List<CommercialBook> booksByAuthorCountry = repoBook.getAllBooks().stream()
                .filter(book -> {
                    Person author = book.getAuthor();
                    return author != null && author.getCountry().equalsIgnoreCase(authorCountry);
                })
                .collect(Collectors.toList());

        if (!booksByAuthorCountry.isEmpty()) {
            System.out.println();
            System.out.println("Buku dengan penulis dari negara " + authorCountry + ":");
            booksByAuthorCountry.forEach(System.out::println);
        } else {
            System.out.println("Tidak ada buku dengan penulis dari negara yang dimasukkan.");
        }
    }


    private static void searchMostExpensiveComic() {
        List<CommercialBook> comics = repoBook.getAllBooks().stream()
                .filter(book -> book instanceof Comic)
                .collect(Collectors.toList());

        Comic mostExpensiveComic = comics.stream()
                .max(Comparator.comparingDouble(CommercialBook::getPrice))
                .map(book -> (Comic) book)
                .orElse(null);

        if (mostExpensiveComic != null) {
            System.out.println("Comic dengan harga paling mahal: ");
            System.out.println(mostExpensiveComic);
        } else {
            System.out.println("Tidak ada Comic tersedia.");
        }
    }

    private static void searchAllMangaka() {
        List<Mangaka> mangakas = repoPerson.getAllMangakas();
        if (!mangakas.isEmpty()) {
            System.out.println("Daftar semua Mangaka: ");
            mangakas.forEach(System.out::println);
        } else {
            System.out.println("Tidak ada Mangaka tersedia.");
        }
    }

    private static void searchAllAuthors() {
        List<Author> authors = repoPerson.getAllAuthors();
        if (!authors.isEmpty()) {
            System.out.println("Daftar semua Authors: ");
            authors.forEach(System.out::println);
        } else {
            System.out.println("Tidak ada Author tersedia.");
        }
    }

    private static void searchAllNovelis() {
        List<Novelis> novelisList = repoPerson.getAllNovelists();
        if (!novelisList.isEmpty()) {
            System.out.println("Daftar semua Novelis:");
            novelisList.forEach(System.out::println);
        } else {
            System.out.println("Tidak ada Novelis tersedia.");
        }
    }

    private static void searchAuthorsByAgeRange() {
        System.out.print("Masukkan rentang umur (contoh: 20-30): ");
        String ageRangeInput = scanner.nextLine();
        String[] ageRange = ageRangeInput.split("-");

        if (ageRange.length == 2) {
            int minAge = Integer.parseInt(ageRange[0]);
            int maxAge = Integer.parseInt(ageRange[1]);

            List<Person> authorsInRange = repoPerson.getPersonsByAgeRange(minAge, maxAge);
            if (!authorsInRange.isEmpty()) {
                System.out.println();
                System.out.println("Authors dengan rentang umur " + ageRangeInput + ":");
                authorsInRange.forEach(System.out::println);
            } else {
                System.out.println("Tidak ada Author dalam rentang umur yang dimasukkan.");
            }
        } else {
            System.out.println("Format rentang umur tidak valid.");
        }
    }

    private static void searchAuthorsByCountry() {
        System.out.print("Masukkan negara penulis: ");
        String authorCountry = scanner.nextLine();
        List<Person> authorsByCountry = repoPerson.getPersonsByCountry(authorCountry);

        if (!authorsByCountry.isEmpty()) {
            System.out.println();
            System.out.println("Authors dari negara " + authorCountry + ":");
            authorsByCountry.forEach(System.out::println);
        } else {
            System.out.println("Tidak ada Author dari negara yang dimasukkan.");
        }
    }

    private static void searchPublisherWithHighestProductionCost() {
        List<Publisher> publishers = repoPublisher.getAllPublishers();
        Publisher publisherWithHighestCost = publishers.stream()
                .max(Comparator.comparingDouble(Publisher::getProductionCost))
                .orElse(null);

        if (publisherWithHighestCost != null) {
            System.out.println("Publisher dengan productionCost paling mahal:");
            System.out.println(publisherWithHighestCost);
        } else {
            System.out.println("Tidak ada Publisher tersedia.");
        }
    }

    private static void searchPublisherWithLowestProductionCost() {
        List<Publisher> publishers = repoPublisher.getAllPublishers();
        Publisher publisherWithLowestCost = publishers.stream()
                .min(Comparator.comparingDouble(Publisher::getProductionCost))
                .orElse(null);

        if (publisherWithLowestCost != null) {
            System.out.println("Publisher dengan productionCost paling murah:");
            System.out.println(publisherWithLowestCost);
        } else {
            System.out.println("Tidak ada Publisher tersedia.");
        }
    }
}

package Tehtava7;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
            return;
        }

        for (Book b : books) {
            System.out.println("Title: " + b.getTitle());
            System.out.println("Author: " + b.getAuthor());
            System.out.println("Year: " + b.getPublicationYear());
            System.out.println("---------------------------");
        }
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;

        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: " + b.getTitle());
                System.out.println("Author: " + b.getAuthor());
                System.out.println("Year: " + b.getPublicationYear());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }
}

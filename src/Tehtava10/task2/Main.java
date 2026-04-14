package Tehtava10.task2;

import Tehtava10.task2.library.model.Book;
import Tehtava10.task2.library.model.LibraryMember;
import Tehtava10.task2.system.Library;



public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("1984", "George Orwell", "ISBN001");
        Book b2 = new Book("Dune", "Frank Herbert", "ISBN002");

        library.addBook(b1);
        library.addBook(b2);

        LibraryMember m1 = new LibraryMember("Alice", 1);

        library.addMember(m1);

        library.borrowBook(m1, b1);
        library.returnBook(m1, b1);
    }
}

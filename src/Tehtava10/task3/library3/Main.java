package Tehtava10.task3.library3;

import Tehtava10.task3.library3.model3.Book3;
import Tehtava10.task3.library3.model3.LibraryMember3;
import Tehtava10.task3.library3.system3.Library3;

public class Main {
    public static void main(String[] args) {

        Library3 library3 = new Library3();


        Book3 b1 = new Book3("1984", "George Orwell", "ISBN001");
        Book3 b2 = new Book3("Dune", "Frank Herbert", "ISBN002");

        library3.addBook(b1);
        library3.addBook(b2);


        LibraryMember3 m1 = new LibraryMember3("Alice", 1);
        LibraryMember3 m2 = new LibraryMember3("Bob", 2);

        library3.addMember(m1);
        library3.addMember(m2);


        library3.reserveBook(m1, b1);
        library3.reserveBook(m2, b2);

        library3.displayReservedBooks(m1);
        library3.displayReservedBooks(m2);


        library3.cancelReservation(m1, b1);
        library3.displayReservedBooks(m1);
    }
}


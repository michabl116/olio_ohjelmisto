package Tehtava10.task3.library3.system3;



import Tehtava10.task3.library3.model3.Book3;
import Tehtava10.task3.library3.model3.LibraryMember3;
import java.util.ArrayList;
import java.util.List;

public class Library3{

    private List<Book3> books = new ArrayList<>();
    private List<LibraryMember3> members = new ArrayList<>();

    public void addBook(Book3 book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember3 member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(LibraryMember3 member, Book3 book) {
        if (!book.isReserved() && !member.getBorrowedBooks().contains(book)) {
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book cannot be borrowed (reserved or already borrowed).");
        }
    }

    public void returnBook(LibraryMember3 member, Book3 book) {
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            System.out.println(member.getName() + " returned: " + book.getTitle());
        } else {
            System.out.println("This member did not borrow this book.");
        }
    }

    // ---------- TAREA 3: RESERVAS ----------

    public void reserveBook(LibraryMember3 member, Book3 book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully: " + book.getTitle());
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember3 member, Book3 book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled: " + book.getTitle());
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember3 member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book3 book : member.getReservedBooks()) {
            System.out.println("- " + book.getTitle());
        }
    }
}


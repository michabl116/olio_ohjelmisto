package Tehtava10.task2.system;



import Tehtava10.task2.library.model.Book;
import Tehtava10.task2.library.model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }
    public void borrowBook(LibraryMember member, Book book) {
        if (!member.getBorrowedBooks().contains(book)) {
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book already borrowed by this member.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            System.out.println(member.getName() + " returned: " + book.getTitle());
        } else {
            System.out.println("This member did not borrow this book.");
        }
    }
}

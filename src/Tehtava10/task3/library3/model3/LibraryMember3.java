package Tehtava10.task3.library3.model3;



import java.util.ArrayList;
import java.util.List;

public class LibraryMember3 {
     String name;
     int memberId;

     List<Book3> borrowedBooks = new ArrayList<>();
     List<Book3> reservedBooks = new ArrayList<>();

    public LibraryMember3(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }
    public int getMemberId() {
        return memberId;
    }

    public List<Book3> getBorrowedBooks() {
        return borrowedBooks;
    }
    public List<Book3> getReservedBooks() {
        return reservedBooks;
    }

    public void borrowBook(Book3 book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book3 book) {
        borrowedBooks.remove(book);
    }


    public void addReservedBook(Book3 book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book3 book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book3 book) {
        return reservedBooks.contains(book);
    }
}


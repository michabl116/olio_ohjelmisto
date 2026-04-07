package Tehtava7;

public class LibraryMain {
    public static void main(String[] args) {

        // Create books
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("1984", "George Orwell", 1949);
        Book b3 = new Book("Animal Farm", "George Orwell", 1945);

        // Create library
        Library library = new Library();

        // Add books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display all books
        System.out.println("📚 All books in the library:");
        library.displayBooks();

        // Search by author
        System.out.println("🔍 Searching for books by George Orwell:");
        library.findBooksByAuthor("George Orwell");
    }
}


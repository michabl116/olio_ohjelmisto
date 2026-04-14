package Tehtava10.task3.library3.model3;



public class Book3 {
    String title;
    String author;
     String isbn;
     boolean reserved = false;

    public Book3(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }

    public boolean isReserved() {
        return reserved; }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return title + " (" + author + ") - ISBN: " + isbn;
    }
}


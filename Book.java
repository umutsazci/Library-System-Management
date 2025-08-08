public class Book {
    int bookId;
    String title;
    String author;
    Book(int id, String title, String author) {
        this.bookId = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + " and Author: " + author;
    }
}

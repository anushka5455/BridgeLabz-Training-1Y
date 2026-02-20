package library.books;

public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book: " + title);
    }
}
import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}

public class MainLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Book Title 1", "Author 1");
        Book book2 = new Book("Book Title 2", "Author 2");

        Library library1 = new Library();
        Library library2 = new Library();

        library1.addBook(book1);
        library2.addBook(book2);

        System.out.println("Library 1 has " + library1.getBooks().size() + " books.");
        System.out.println("Library 2 has " + library2.getBooks().size() + " books.");
    }
}

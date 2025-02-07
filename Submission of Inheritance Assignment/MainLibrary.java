class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name + ", Bio: " + bio);
    }
}

public class MainLibrary {
    public static void main(String[] args) {
        Author author = new Author("1984", 1949, "George Orwell", "George Orwell was an English novelist and essayist.");
        author.displayInfo();
    }
}

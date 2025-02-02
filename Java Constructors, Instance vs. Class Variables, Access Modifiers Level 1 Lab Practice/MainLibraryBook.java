import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("The book \"" + title + "\" is not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }
}

public class MainLibraryBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Title of the Book");
        String title = sc.nextLine();
        System.out.println("Enter the Author of the Book");
        String author = sc.nextLine();
        System.out.println("Enter the Price of the Book");
        double price = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("Is the Book Available? (true/false)");
        boolean availability = sc.nextBoolean();

        Book book = new Book(title, author, price, availability);

        System.out.println("=== Book Details ===");
        book.displayDetails();
        System.out.println("\nBorrowing the Book:");
        book.borrowBook();
        System.out.println("\n=== Book Details After Borrowing ===");
        book.displayDetails();
    }
}

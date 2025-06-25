import java.util.Scanner;

public class Book {
    
    private String title;
    private String author;
    private String publisher;
    private double price;

    
    public Book(String title, String author, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    
    public void inputBookDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        this.title = scanner.nextLine();

        System.out.print("Enter author name: ");
        this.author = scanner.nextLine();

        System.out.print("Enter publisher name: ");
        this.publisher = scanner.nextLine();

        System.out.print("Enter book price: ");
        this.price = scanner.nextDouble();
    }

    
    public void displayBookInfo() {
        System.out.println("-------------------------------------------------");
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------------------------------");
    }

    
    public static Book searchBookByTitle(Book[] books, String searchTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                return book; 
            }
        }
        return null; 
    }

    
    public static void main(String[] args) {
        
        Book[] library = new Book[3];
        
        
        library[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 10.99);
        library[1] = new Book("1984", "George Orwell", "Secker & Warburg", 15.99);
        library[2] = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 12.99);

        
        System.out.println("Library Books:");
        for (Book book : library) {
            book.displayBookInfo();
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book to search: ");
        String searchTitle = scanner.nextLine();

        Book foundBook = searchBookByTitle(library, searchTitle);
        if (foundBook != null) {
            System.out.println("Book found!");
            foundBook.displayBookInfo();
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}

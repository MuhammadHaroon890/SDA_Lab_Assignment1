import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Book {
    String title;
    String author;
    String isbn;

    
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("-----------------------");
    }
}


class Library {
    List<Book> books;

    
    Library() {
        books = new ArrayList<>();
    }

  
    void addBook(Book book) {
        books.add(book);
    }

    
    void searchBookByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book with title '" + title + "' not found.");
        }
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "123456789"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "987654321"));
        library.addBook(new Book("Data Structures", "Mark Weiss", "456123789"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title to search: ");
        String searchTitle = scanner.nextLine();

       
        library.searchBookByTitle(searchTitle);
    }
}

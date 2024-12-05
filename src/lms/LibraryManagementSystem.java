package lms;
import java.util.*;

class LibraryManagementSystem {
    private List<Book> books = new ArrayList<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            books.forEach(System.out::println);
        }
    }

    // Update a book's details
    public void updateBook(int isbn, String newTitle, String newAuthor) {
        for (Book b : books) {
            if (b.getIsbn() == isbn) {
                b.setTitle(newTitle);
                b.setAuthor(newAuthor);
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // Delete a book by ISBN
    public void deleteBook(int isbn) {
        if (books.removeIf(b -> b.getIsbn() == isbn)) {
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Search for a book by title
    public Book searchBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}

package lms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    int isbn = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    lms.addBook(new Book(isbn, title, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("\nLibrary Books:");
                    lms.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter ISBN of the book to update: ");
                    isbn = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter new Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    author = scanner.nextLine();
                    lms.updateBook(isbn, title, author);
                    break;

                case 4:
                    System.out.print("Enter ISBN of the book to delete: ");
                    isbn = scanner.nextInt();
                    lms.deleteBook(isbn);
                    break;

                case 5:
                    System.out.print("Enter Title of the book to search: ");
                    title = scanner.nextLine();
                    Book foundBook = lms.searchBookByTitle(title);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
package student.management.project;

import java.util.Scanner;

class Login {
    private static final String ADMIN_USERNAME = "student";
    private static final String ADMIN_PASSWORD = "ice241";

    public static boolean login(Scanner scanner) {
        System.out.println("Login to Student Management System");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return false;
        }
    }
}

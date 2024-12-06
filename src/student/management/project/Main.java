package student.management.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        // Login mechanism
        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            isLoggedIn = Login.login(scanner);
        }

        int choice;
        do {
            System.out.println("\nStudent Management System:");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student by Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Contact Number: ");
                        int num = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Department: ");
                        String dept = scanner.nextLine();
                        System.out.print("Enter Course: ");
                        String course = scanner.nextLine();
                        sms.addStudent(new Student(id, name, num, course, dept));
                        break;

                    case 2:
                        System.out.println("\nStudent List:");
                        sms.viewAllStudents();
                        break;

                    case 3:
                        System.out.print("Enter Student ID to update: ");
                        id = scanner.nextInt();
                        scanner.nextLine();    // Consume newline
                        System.out.print("Enter new Name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter new Contact Number: ");
                        num = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new Course: ");
                        course = scanner.nextLine();
                        sms.updateStudent(id, name, num, course);
                        break;

                    case 4:
                        System.out.print("Enter Student ID to delete: ");
                        id = scanner.nextInt();
                        sms.deleteStudent(id);
                        break;

                    case 5:
                        System.out.print("Enter Name to search: ");
                        name = scanner.nextLine();
                        Student foundStudent = sms.searchStudentByName(name);
                        if (foundStudent != null) {
                            System.out.println("Student found: " + foundStudent);
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting the system. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (DuplicateStudentException | StudentNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        } while (choice != 6);

        scanner.close();
    }
}

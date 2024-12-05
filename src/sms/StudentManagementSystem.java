package sms;
import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    private String department;

    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}

class Course {
    private int courseId;
    private String courseName;
    private String department;
    private List<Student> enrolledStudents;

    public Course(int courseId, String courseName, String department) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.department = department;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (student.getDepartment().equals(this.department)) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " enrolled in " + courseName);
        } else {
            System.out.println("Student " + student.getName() + " cannot enroll in this course as they belong to a different department.");
        }
    }

    public void listEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students are enrolled in this course.");
        }
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class Faculty {
    private int facultyId;
    private String facultyName;
    private String department;

    public Faculty(int facultyId, String facultyName, String department) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId=" + facultyId +
                ", facultyName='" + facultyName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class Department {
    private String departmentName;
    private List<Faculty> faculties;
    private List<Course> courses;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        if (faculty.toString().contains(departmentName)) {
            faculties.add(faculty);
            System.out.println(faculty + " added to " + departmentName);
        } else {
            System.out.println("Faculty " + faculty + " does not belong to this department.");
        }
    }

    public void addCourse(Course course) {
        if (course.toString().contains(departmentName)) {
            courses.add(course);
            System.out.println(course + " added to " + departmentName);
        } else {
            System.out.println("Course " + course + " does not belong to this department.");
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", faculties=" + faculties +
                ", courses=" + courses +
                '}';
    }
}

public class StudentManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Student> students = new ArrayList<>();
    private static final List<Course> courses = new ArrayList<>();
    private static final List<Faculty> faculties = new ArrayList<>();
    private static final List<Department> departments = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Add Faculty");
            System.out.println("4. Add Department");
            System.out.println("5. Enroll Student in Course");
            System.out.println("6. List Students in Course");
            System.out.println("7. List All Departments");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addCourse();
                    break;
                case 3:
                    addFaculty();
                    break;
                case 4:
                    addDepartment();
                    break;
                case 5:
                    enrollStudentInCourse();
                    break;
                case 6:
                    listStudentsInCourse();
                    break;
                case 7:
                    listAllDepartments();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void listAllDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
        } else {
            for (Department department : departments) {
                System.out.println(department);
            }
        }
    }

    private static void listStudentsInCourse() {
        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();
        scanner.nextLine();

        Course course = courses.stream()
                .filter(c -> c.toString().contains("courseId=" + courseId))
                .findFirst()
                .orElse(null);

        if (course != null) {
            course.listEnrolledStudents();
        } else {
            System.out.println("Course not found.");
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Department: ");
        String department = scanner.nextLine();

        students.add(new Student(id, name, age, department));
        System.out.println("Student added successfully.");
    }

    private static void addCourse() {
        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Course Department: ");
        String department = scanner.nextLine();

        courses.add(new Course(courseId, courseName, department));
        System.out.println("Course added successfully.");
    }

    private static void addFaculty() {
        System.out.print("Enter Faculty ID: ");
        int facultyId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Faculty Name: ");
        String facultyName = scanner.nextLine();
        System.out.print("Enter Faculty Department: ");
        String department = scanner.nextLine();

        faculties.add(new Faculty(facultyId, facultyName, department));
        System.out.println("Faculty added successfully.");
    }

    private static void addDepartment() {
        System.out.print("Enter Department Name: ");
        String departmentName = scanner.nextLine();

        departments.add(new Department(departmentName));
        System.out.println("Department added successfully.");
    }

    private static void enrollStudentInCourse() {
        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        Course course = courses.stream()
                .filter(c -> c.toString().contains("courseId=" + courseId))
                .findFirst()
                .orElse(null);
        Student student = students.stream()
                .filter(s -> s.getId() == studentId)
                .findFirst()
                .orElse(null);

        if (course != null && student != null) {
            course.enrollStudent(student);
        } else {
            System.out.println("Course or Student not found.");
        }
    }
}

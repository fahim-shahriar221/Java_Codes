package student.management.project;
import java.util.ArrayList;
import java.util.List;

interface StudentManagement {
    void addStudent(Student student) throws DuplicateStudentException;
    void updateStudent(int id, String newName, int newNum, String newCourse);
    void deleteStudent(int id) throws StudentNotFoundException;
    Student searchStudentByName(String name);
}
class StudentManagementSystem implements StudentManagement {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) throws DuplicateStudentException {
        if (students.stream().anyMatch(s -> s.getId() == student.getId())) {
            throw new DuplicateStudentException("Student with ID " + student.getId() + " already exists.");
        }
        students.add(student);
        System.out.println("Student added successfully!");
    }

    @Override
    public void updateStudent(int id, String newName, int newNum, String newCourse) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.update();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    @Override
    public void deleteStudent(int id) throws StudentNotFoundException {
        Student student = students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        if (student == null) {
            throw new StudentNotFoundException("Student with ID " + id + " not found.");
        }
        students.remove(student);
        System.out.println("Student deleted successfully!");
    }

    @Override
    public Student searchStudentByName(String name) {
        return students.stream().filter(s -> s.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            students.forEach(Student::view);
        }
    }
}
class DuplicateStudentException extends Exception {
    public DuplicateStudentException(String message) {
        super(message);
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

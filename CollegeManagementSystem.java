import java.util.ArrayList;
import java.util.Scanner;

// Student Class
class Student {
    private String name;
    private int id;
    private String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}

// Faculty Class
class Faculty {
    private String name;
    private int id;
    private String department;

    public Faculty(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

// Course Class
class Course {
    private String name;
    private int code;
    private String instructor;

    public Course(String name, int code, String instructor) {
        this.name = name;
        this.code = code;
        this.instructor = instructor;
    }

    public void display() {
        System.out.println("Code: " + code + ", Name: " + name + ", Instructor: " + instructor);
    }
}

// Main College Management System
public class CollegeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Faculty> faculties = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== College Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Add Faculty");
            System.out.println("4. Display Faculties");
            System.out.println("5. Add Course");
            System.out.println("6. Display Courses");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) { // Handle wrong input
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter course: ");
                    String studentCourse = scanner.nextLine();
                    students.add(new Student(studentName, studentId, studentCourse));
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("\n--- Students List ---");
                        for (Student student : students) {
                            student.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter faculty name: ");
                    String facultyName = scanner.nextLine();
                    System.out.print("Enter faculty ID: ");
                    int facultyId = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter department: ");
                    String facultyDepartment = scanner.nextLine();
                    faculties.add(new Faculty(facultyName, facultyId, facultyDepartment));
                    System.out.println("✅ Faculty added successfully!");
                    break;

                case 4:
                    if (faculties.isEmpty()) {
                        System.out.println("No faculties available.");
                    } else {
                        System.out.println("\n--- Faculties List ---");
                        for (Faculty faculty : faculties) {
                            faculty.display();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter course code: ");
                    int courseCode = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter instructor: ");
                    String courseInstructor = scanner.nextLine();
                    courses.add(new Course(courseName, courseCode, courseInstructor));
                    System.out.println("✅ Course added successfully!");
                    break;

                case 6:
                    if (courses.isEmpty()) {
                        System.out.println("No courses available.");
                    } else {
                        System.out.println("\n--- Courses List ---");
                        for (Course course : courses) {
                            course.display();
                        }
                    }
                    break;

                case 7:
                    System.out.println("Exiting... Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}

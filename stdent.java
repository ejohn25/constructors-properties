// Elijah Johnson
class Student {

    // Student info
    String name;
    int age;
    String email;
    String phoneNumber;
    String stage;
    String[] courses;

    // Constructor
    Student(String name, int age, String email, String phoneNumber,
            String stage, String[] courses) {

        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;
        this.courses = courses;
    }

    // student details
    void printMe() {
        System.out.println("\nStudent Information");
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Stage: " + stage);

        System.out.println("Courses:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("- " + courses[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Student 1 (2 courses)
        String[] courses1 = {"Math", "English"};
        Student student1 = new Student(
                "Alice",
                18,
                "alice@email.com",
                "123456789",
                "Stage 1",
                courses1
        );

        // Student 2 (4 courses)
        String[] courses2 = {"Java", "Database", "Networking", "Web Design"};
        Student student2 = new Student(
                "Brian",
                20,
                "brian@email.com",
                "987654321",
                "Stage 2",
                courses2
        );

        // Student 3 (6 courses)
        String[] courses3 = {
                "Programming",
                "Data Structures",
                "Algorithms",
                "Operating Systems",
                "Software Engineering",
                "Cyber Security"
        };
        Student student3 = new Student(
                "Chloe",
                21,
                "chloe@email.com",
                "555123456",
                "Stage 3",
                courses3
        );

        // all students
        student1.printMe();
        student2.printMe();
        student3.printMe();
    }
}

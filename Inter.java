// Defining an interface
interface Person {
    void displayFirstName();
    void displayLastName();
    void displayAddress();
}

// Implementing the interface in a class
class Student implements Person {
    public void displayFirstName() {
        System.out.println("First Name: Shiv");
    }

    public void displayLastName() {
        System.out.println("Last Name: Kant");
    }

    public void displayAddress() {
        System.out.println("Address: Patna");
    }
}

// Another class implementing the same interface
class Teacher implements Person {
    public void displayFirstName() {
        System.out.println("First Name: Golu");
    }

    public void displayLastName() {
        System.out.println("Last Name: Sharma");
    }

    public void displayAddress() {
        System.out.println("Address: Delhi");
    }
}

public class Inter {
    public static void main(String[] args) {
        // Creating instances of the classes that implement the interface
        Person student = new Student();
        Person teacher = new Teacher();

        // Calling methods through the interface reference
        System.out.println("Student Info:");
        student.displayFirstName();
        student.displayLastName();
        student.displayAddress();

        System.out.println("\nTeacher Info:");
        teacher.displayFirstName();
        teacher.displayLastName();
        teacher.displayAddress();
    }
}

package welcome.bank;

class Student {

    // Private variable
    private String name = "Arun";

    // Getter method
    public String getName() {
        return name;
    }
}

public class Main {

    // Main method
    public static void main(String[] args) {

        // Creating object
        Student s = new Student();

        // Calling getter method
        System.out.println(s.getName());
    }
}
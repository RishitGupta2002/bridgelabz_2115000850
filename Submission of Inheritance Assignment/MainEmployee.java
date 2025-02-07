class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String mentor;

    Intern(String name, int id, double salary, String mentor) {
        super(name, id, salary);
        this.mentor = mentor;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Mentor: " + mentor);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 75000, 5);
        Employee developer = new Developer("Bob", 102, 65000, "Java");
        Employee intern = new Intern("Charlie", 103, 30000, "Dave");

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}

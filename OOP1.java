// OOP Concepts in One Program

//  Abstraction
abstract class Employee {

    //  Encapsulation
    private String name;
    private int salary;

    // Constructor
    Employee(String name, int salary) {
        this.name = name;      // this keyword
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // Abstract method
    abstract void work();
}

// Inheritance
class Developer extends Employee {

    String language;

    Developer(String name, int salary, String language) {

        // super keyword
        super(name, salary);

        this.language = language;
    }

    // Polymorphism (Method Overriding)
    @Override
    void work() {
        System.out.println(getName() + " is coding in " + language);
    }
}

class Manager extends Employee {

    int teamSize;

    Manager(String name, int salary, int teamSize) {

        super(name, salary);

        this.teamSize = teamSize;
    }

    // Method overriding
    @Override
    void work() {
        System.out.println(getName() + " is managing team of " + teamSize + " people");
    }
}

// Main class
public class MainOOP {
    public static void main(String[] args) {

        // Object creation
        Employee emp1 = new Developer("Rahul", 80000, "Java");
        Employee emp2 = new Manager("Amit", 100000, 5);

        // Runtime Polymorphism
        emp1.work();
        emp2.work();

        // Accessing encapsulated data
        System.out.println("Salary of " + emp1.getName() + " : " + emp1.getSalary());

        System.out.println("Salary of " + emp2.getName() + " : " + emp2.getSalary());
    }
}

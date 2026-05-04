//The 4 Pillars of OOP--
    //1.Encapsulation
    //2.Abstraction
    //3.Inheritance
    //4.Polymorphism
//==============================================================================================================

/// Encapsulation + Abstraction + Inheritance + Polymorphism

//  Abstraction
abstract class Employee {
    private String name;   // Encapsulation

    // Constructor
    Employee(String name) {
        this.name = name;
    }

    // Getter (Encapsulation)
    public String getName() {
        return name;
    }

    // Abstract method (Abstraction)
    abstract void work();
}

//  Inheritance
class Developer extends Employee {

    Developer(String name) {
        super(name);
    }

    //  Polymorphism (Method Overriding)
    void work() {
        System.out.println(getName() + " is writing code");
    }
}

class Manager extends Employee {

    Manager(String name) {
        super(name);
    }

    //  Polymorphism (Method Overriding)
    void work() {
        System.out.println(getName() + " is managing team");
    }
}

//  Main class
public class MainOOP {
    public static void main(String[] args) {

        //  Polymorphism (same reference, different objects)
        Employee e1 = new Developer("Rahul");
        Employee e2 = new Manager("Amit");

        e1.work();
        e2.work();
    }
}







}

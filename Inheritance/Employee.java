package Inheritance;

public class Employee {
    String name;
    int age;
    float salary;

    Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    float getYearlySalary() {
        return this.salary*12;
    }

    void display() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nSalary: " + this.getYearlySalary());
    }
}
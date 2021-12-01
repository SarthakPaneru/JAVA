package Payment_System;

public class Person {
    private String name;
    private long phoneNum;

    Person(String name, long phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    void display() {
        System.out.println("\nName: " + this.name + "\nPhone Number: " + this.phoneNum);
    }
}

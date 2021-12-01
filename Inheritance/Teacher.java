package Inheritance;

public class Teacher extends Employee {
    int noOfSubject;

    Teacher(String name, int age, float salary, int noOfSubject) {
        super(name, age, salary);
        this.noOfSubject = noOfSubject;
    }

    float getYearlySalary() {
        return (super.getYearlySalary()+noOfSubject*2000*12);
    }
    
    public static void main(String[] args) {
        Teacher T = new Teacher("Ram", 30, 20000, 5);

        T.display();
    }
}

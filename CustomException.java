class Student {
    private String name;
    private int sem;

    public Student(String name, int sem) throws SemesterException{
        if (sem>8 || sem <1) {
            throw new SemesterException("Invalid!");
        } else {
            this.name = name;
            this.sem = sem;
        }
    }
}

class SemesterException extends Exception {
    public SemesterException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String [] args) {
        try {
            Student s = new Student("John", -5);
        } catch (SemesterException e) {
            System.out.println(e.getMessage());
        }
    }
}

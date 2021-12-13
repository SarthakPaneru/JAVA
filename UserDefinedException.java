class People {
    private String name;
    private int age;

    public People(String name, int age) throws InvalidAgeException{
        if (age<18) {
            throw new InvalidAgeException("Under age");
        } else {
            this.name = name;
            this. age = age;
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class UserDefinedException {
    public static void main(String [] args) {
        try {
            People p = new People("Ram", 15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

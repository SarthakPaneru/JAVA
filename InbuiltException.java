import java.util.*;

public class InbuiltException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter a number ");
            int a = s.nextInt();
            System.out.println("Enter another number: ");
            int b = s.nextInt();
            try {
                int c = a/b;
                System.out.println("Answer = " + c);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program Ends");
        }
    }
}

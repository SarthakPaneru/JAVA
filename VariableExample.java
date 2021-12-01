public class VariableExample {
    int instanceVariable;
    static int class_static_variable = 100;

    public static void main(String[] args) {
        int x = 10;

        VariableExample obj = new VariableExample();

        System.out.println("Value of instance variable = " + obj.instanceVariable);
        System.out.println("Value of class/static variable = " + class_static_variable);
        System.out.println("Value of local variable = " + x);
    }
}

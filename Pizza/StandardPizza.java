package Pizza;

public class StandardPizza extends Pizza {

    StandardPizza(int total) {
        super(total, 100);
    }

    StandardPizza() {
        this(0);
    }

}

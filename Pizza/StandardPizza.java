package Pizza;

public class StandardPizza extends Pizza {

    StandardPizza(int total) {
        super(total, 100);
    }

    void getTotal(int total) {
        this.total += total;
    }
}

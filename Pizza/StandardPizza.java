package Pizza;

public class StandardPizza extends Pizza {
    //private int price;

    StandardPizza(int total) {
        super(total, 100);
    }

    void getTotal(int total) {
        this.total += total;
    }

    //void getPrice(int price)
}
